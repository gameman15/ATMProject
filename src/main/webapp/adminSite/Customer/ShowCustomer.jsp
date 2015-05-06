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
        <h4 class="text-danger"><s:actionerror name="error"/></h4>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Customer ID: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerId"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Account ID: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="accountId"/></div></div>
        <div class="row"> 
            <label class="col-xs-12 col-sm-6 col-md-2">Name: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerName"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Address: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerAddress"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">City: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerCity"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">State: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerState"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Email: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="customerEmail"/></div></div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Pin: </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="pin"/></div></div>
        <div class="row"> 
            <label class="col-xs-12 col-sm-6 col-md-2">Card No. </label>
            <div class="col-xs-12 col-sm-6 col-md-2"><s:property value="cardnumber"/></div></div>
    </body>
</html>