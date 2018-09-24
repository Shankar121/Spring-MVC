<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer-form</title>
<style type="text/css">
.error{
color:red;
}

</style>
</head>
<body>
<br>
<form:form action="processForm" modelAttribute="customerForm">
<br>
FirstName: <form:input path="firstName"/>
<br>
LastName: <form:input path="lastName"/>
<form:errors cssClass="error" path="lastName"></form:errors>
<br>
Customer Age: <form:input path="age"/>
<form:errors cssClass="error" placeholder="Age" path="age"></form:errors>
<br>
Postal Code: <form:input path="postalCode"/>
<form:errors cssClass="error"  path="postalCode"></form:errors>
<br>
Course Code: <form:input path="courseCode"/>
<form:errors cssClass="error"  path="courseCode"></form:errors>
<br>
<form:button name="submit" value="submit" id="submit">Submit</form:button>
</form:form>
</body>
</html>