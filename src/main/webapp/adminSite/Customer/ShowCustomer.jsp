<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <title>Customer</title>
    </head>
    <body>
        <h1>Customer Details</h1>
        <s:property value="customerId"/><br/>
        <s:property value="accountId"/><br/>
        <s:property value="customerName"/><br/>
        <s:property value="customerAddress"/><br/>
        <s:property value="customerCity"/><br/>
        <s:property value="customerState"/><br/>
        <s:property value="customerEmail"/><br/>
        <s:property value="pin"/><br/>
        <s:property value="cardnumber"/><br/>
    </body>
</html>
