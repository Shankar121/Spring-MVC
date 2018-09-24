<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Form</title>
</head>
<body>
<h1>Student: ${student.firstName} ${student.lastName} from ${student.country}</h1>
Favorite Language: ${student.favoriteLanguage}
<br>
Operating Systems:
<c:forEach items="${student.operatingSystems}" var="os">
${os}
</c:forEach>

</body>
</html>