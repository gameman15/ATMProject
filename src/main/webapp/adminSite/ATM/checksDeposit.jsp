<%-- 
    Document   : checksDeposit
    Created on : Apr 30, 2015, 9:48:12 AM
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
        <h1>View checks Deposited</h1>
        <s:form action="checksDeposit" method="post">
            <s:textfield type="text" label="ATM ID " name="atmId" required="true"/>
            <s:submit name="submit" label="Submit" align="center"/>
        </s:form>

    </body>
</html>
