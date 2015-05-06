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
    <body class="container-fluid">
        <h1>Please input ATM details</h1>
        <s:form action="DeleteATM" method="post">
            <div class= "row">
                <label class="col-xs-6 col-sm-4 col-md-2 col-lg-1">ATM ID: </label>
                <div class="col-xs-6 col-sm-4 col-md-2 col-lg-1">
                    <s:textfield type="text" label="ATM ID " name="atmId" required="true"/>
                </div>
            </div>
            <input class="row col-xs-12 col-sm-6 col-md-2 col-lg-1 btn btn-primary" type="submit"/>
        </s:form>
    </body>
</html>
