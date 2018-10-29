<%@ page import="java.util.List" %>
<%@ page import="cn.pojo.Site" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page isELIgnored="false" %>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>My JSP 'home.jsp' starting page</title>



</head>

<body>
    <h1>
        <c:forEach items="${hehe}" var="item" >
            <h2>${item.saddress}</h2>
        </c:forEach>
    </h1>
</body>
</html>
