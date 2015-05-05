<%-- 
    Document   : error
    Created on : May 5, 2015, 3:06:07 PM
    Author     : admin
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Unknown error occurred</h1>
        <s:property value="%{exception.message}"/>
    </body>
</html>
