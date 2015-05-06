<%-- 
    Document   : admin_panel
    Created on : Apr 21, 2015, 10:25:13 PM
    Author     : AF5024443
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/htrset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <h1>Admin Panel</h1>

        Hello, <s:property value="#session.name"/> <br>

        <s:form action="AdminLogout">
            <s:submit name="logout" value="Logout"/>
        </s:form>

        <s:form action="Delete.jsp">
            <s:submit name="delete" value="Delete ATM"/>
        </s:form>

        <s:form action="Edit.jsp">
            <s:submit name="edit" value="Edit ATM"/>
        </s:form>

        <s:form action="addATM.jsp">
            <s:submit name="add" value="Add ATM"/>
        </s:form>

        <s:form action="checksDeposit.jsp">
            <s:submit name="Checks" value="View Checks"/>
        </s:form>


    </body>
</html>
