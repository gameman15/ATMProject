<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Add New Customer</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <form name="editCustomer" action="editCustomer" method="POST">
            <h1 class="title">Edit Customer Info</h1>
            <div class="row">
                <label class="col-xs-12 col-sm-6 col-md-2">Account ID: </label>
                    
                <div class="col-xs-12 col-sm-6 col-md-2">
                    <s:textfield id="accountIdIn" label="Account ID" name="accountId" type="text" placeholder="Enter New Name" value="%{accountId}" readonly="true"/>
                </div>
            </div>
            <div class="row">
                <label class ="col-xs-12 col-sm-6 col-md-2">Customer ID: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">    
                    <s:textfield id="customerIdIn" label="Customer ID" name="customerId" type="text" placeholder="Enter New Name" value="%{customerId}" readonly="true"/>                    
                </div>
            </div>        
            <div class="row">    
                <label class="col-xs-12 col-sm-6 col-md-2">Customer Name: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">    
                    <s:textfield id="customerNameIn" label="Customer Name" name="customerName" type="text" placeholder="Enter New Name" value="%{customerName}"/>
                </div>
            </div>
            <div class="row">
                <label class="col-xs-12 col-sm-6 col-md-2">Customer Address: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">    
                    <s:textfield id="customerAddressIn" label="Customer Address" name="customerAddress" type="text" placeholder="Enter New Address" value="%{customerAddress}"/>
                </div>
            </div>
            <div class="row">
                <label class="col-xs-12 col-sm-6 col-md-2">Customer City: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">   
                    <s:textfield id="customerCityIn" label="Customer City" name="customerCity" type="text" placeholder="Enter New City" value="%{customerCity}"/>
                </div>
                
            </div>
            <div class="row">
                <label class="col-xs-12 col-sm-6 col-md-2">Customer State: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">
                    <s:textfield id="customerStateIn" label="Customer State" name="customerState" type="text" placeholder="Enter New State" value="%{customerState}"/>
                </div>
            </div>      
            <div class="row">    
                <label class="col-xs-12 col-sm-6 col-md-2">Customer Email: </label>
                <div class="col-xs-12 col-sm-6 col-md-2">
                    <s:textfield id="customerEmailIn" label="Customer Email" name="customerEmail" type="email" placeholder="Enter New Email" value="%{customerEmail}"/>
                </div>
            </div>           
            <div class="row">            
                <label class="col-xs-12 col-sm-6 col-md-2 ">Customer Pin: </label>
                    
                <div class="col-xs-12 col-sm-6 col-md-2 ">       
                    <s:textfield id="customerPinIn" label="Customer Pin" name="pin" type="text" placeholder="Enter New Pin" value="%{pin}"/>
                </div>
            </div> 
            <div class = "btn-group">
                <button class="  btn btn-primary" id="cancel" name="cancel" value="Cancel">Cancel</button>
                <button class="  btn btn-primary" id="submit" name="submit" type="submit" value="Submit">Submit</button>
            </div>
        </form>
                    
      
    </body>
</html>
