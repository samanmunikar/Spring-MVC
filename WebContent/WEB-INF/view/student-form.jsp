<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		
		<br></br>
		Last Name:  <form:input path="lastName" />
		<br></br>
		Country:   <form:select path="country">
		
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		<br></br>
		Favorite Language:   
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		R <form:radiobutton path="favoriteLanguage" value="R" />
		<br></br>
		Operating System: 
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MAC OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
		<br></br>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>