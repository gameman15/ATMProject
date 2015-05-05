<%-- 
    Document   : addAtmSuccess
    Created on : Apr 28, 2015, 10:12:44 AM
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
  
        <title>ATM Created</title>
    </head>
    <body class="container-fluid">
        <h1>ATM has been added</h1>
        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-2">New ATM ID: </div>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="atm.id"/></div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-2">Assigned Branch ID: </div>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="atm.bankbranch.id"/></div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-2">Initial Till Allotment: </div>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="atm.till"/></div>
        </div>
    </body>
</html>
