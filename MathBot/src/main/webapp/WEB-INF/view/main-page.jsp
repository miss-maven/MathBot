<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is the main page.</h1>
        <p> ${WelcomeMessage}</p> 
        
        <c:forEach items = "${users}" var= "user"> 
            <p>${user.name}</p>
            <p>${user.email}</p>
        </c:forEach>
    </body>
</html>
