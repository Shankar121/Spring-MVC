<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student-form</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">
<br>
FirstName: <form:input path="firstName"/>
<br>
LastName: <form:input path="lastName"/>
<br>
Country:
<form:select path="country">
<form:options items="${countryOptions}"/>
</form:select>
<br>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
HTML <form:radiobutton path="favoriteLanguage" value="HTML"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
<br>

Operating Systems: 
Windows <form:checkbox path="operatingSystems" value="Windows"/>
MAC OS <form:checkbox path="operatingSystems" value="MAC OS"/>
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Ubuntu <form:checkbox path="operatingSystems" value="Ubuntu"/>

<br>
<form:button name="submit" value="submit" id="submit">Submit</form:button>
</form:form>
</body>
</html>