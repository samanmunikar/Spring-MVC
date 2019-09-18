<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Customer Registration Form</title>
<style>
	.error {color: red}
</style>
</head>
<body>
<i>Fill out the form. Asterisk(*) means required. </i>
	<form:form action="processForm" modelAttribute="customer">
		First Name:  <form:input path="firstName" />
		<br></br>
		Last Name (*) :  <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		<br></br>
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>