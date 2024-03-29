package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result=false;
		
		if (theCode != null) {
			for (String tempPrefix : coursePrefix) {
				result = theCode.startsWith(tempPrefix);
				if (result == true) {
					break;
				}
			}
			
		} else {
			result = false;
		}
		
				
		return result;
	}

	
}
