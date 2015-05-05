<%-- 
    Document   : deleteResults
    Created on : Apr 29, 2015, 3:31:24 PM
    Author     : DD5024435
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Account has been Deleted</h1>
        <s:property value="atm.id"/>
        <s:property value="atm.bankbranch.id"/>
        <s:property value="atm.till"/>
    </body>
</html>
