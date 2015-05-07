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
            <table id="editCustomer" class="form">

                
                <tr>
                    <th class="1">
                        <label>Account ID: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="accountIdIn" label="Account ID" name="accountId" type="text" placeholder="Enter New Name" value="%{accountId}" readonly="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>
                
                
                <tr>
                    <th class="1">
                        <label>Customer ID: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerIdIn" label="Customer ID" name="customerId" type="text" placeholder="Enter New Name" value="%{customerId}" readonly="true"/>                    </th>
                    <th class="3">
                    </th>
                </tr>
                
                
                <tr>
                    <th class="1">
                        <label>Customer Name: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerNameIn" label="Customer Name" name="customerName" type="text" placeholder="Enter New Name" value="%{customerName}" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>

                <tr>
                    <th class="1">
                        <label>Customer Address: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerAddressIn" label="Customer Address" name="customerAddress" type="text" placeholder="Enter New Address" value="%{customerAddress}" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>
                
                 <tr>
                    <th class="1">
                        <label>Customer City: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerCityIn" label="Customer City" name="customerCity" type="text" placeholder="Enter New City" value="%{customerCity}" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>
                
                  </tr>
                
                 <tr>
                    <th class="1">
                        <label>Customer State: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerStateIn" label="Customer State" name="customerState" type="text" placeholder="Enter New State" value="%{customerState}" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>

                <tr>
                    <th class="1">
                        <label>Customer Email: </label>
                    </th>
                    <th class="2">
                        <s:textfield id="customerEmailIn" label="Customer Email" name="customerEmail" type="email" placeholder="Enter New Email" value="%{customerEmail}" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>
                
                 <tr>
                    <th class="1">
                        <label>Customer Pin: </label>
                    </th>
                    <th class="2">
                       
                        <s:textfield id="customerPinIn" label="Customer Pin" name="pin" type="number" placeholder="Enter New Pin" value="%{pin}" min="0" max="9999" required="true"/>
                    </th>
                    <th class="3">
                    </th>
                </tr>

                <tr>
                    <th class="button1">
                        <button id="cancel" name="cancel" value="Cancel">Cancel</button>
                    </th>
                    <th class="button3">
                        <button id="submit" name="submit" type="submit" value="Submit">Submit</button>
                    </th>
                </tr>

            </table>
        </form>
                    
      
    </body>
</html>
