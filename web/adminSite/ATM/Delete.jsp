<%-- 
    Document   : modifyORDelete
    Created on : Apr 24, 2015, 10:36:17 AM
    Author     : DD5024435
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
   
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete</h1>
        <s:form action="DeleteATM" method="post">
            <s:textfield type="text" label="ATM ID: " name="atmId" required="true"/>
            <s:textfield type="text" label="Branch ID: " name="till" required="true"/>
            <s:submit name="submit" label="Log In" align="center"/>
        </s:form>
    </body>
</html>
