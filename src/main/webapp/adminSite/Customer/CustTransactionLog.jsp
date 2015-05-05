<%-- 
    Document   : CustTransactionLog
    Created on : Apr 27, 2015, 4:19:13 PM
    Author     : SG5024432
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <title>Customer Transaction Log</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body class="container-fluid">
        <h1> Customer Transaction Log </h1><br>
            
        
        <form action="customerTransaction">
            <div class ="row">
                <b class="col-xs-6 col-sm-4 col-md-2 ">Account Number:</b>
                <input class="col-xs-6 col-sm-4 col-md-2 " type="number" name="accountNumber">
            </div>
            <div class="row text-danger"><s:fielderror name="invalidInput"/></div>
            
        
            <b class="row">Date Range: </b>
            
            <div class="row">
                 <label class="col-xs-6 col-sm-4 col-md-2 " for="Log">From : </label>
                 <input class="col-xs-6 col-sm-4 col-md-2 " id="meeting" type="date" name="beginDate"/><br>
            </div>
            <div class="row">
                 <label class="col-xs-6 col-sm-4 col-md-2 " for="Log">To : </label>
                 <input class="col-xs-6 col-sm-4 col-md-2 " id="meeting" type="date" name="endDate"/>
            </div>     
            
            <i class="row text-info">*Leave blank for all transactions*</i>
            <br><br>
            <input class="row col-xs-12 col-sm-6 col-md-2  btn btn-primary" type="submit"/>
        </form>
        
        <br><br><br>
        
        <table class="table table-bordered table-striped">
            <tr>
                <td>ID</td>
                <td>ACCOUNTID</td>
                <td>ATMID</td>
                <td>TIME</td>
                <td>DESCRIPTION</td>
                <td>AMOUNT</td>
            </tr>
            <s:iterator value="transactions">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="bankaccount.accountid"/></td>
                    <td><s:property value="bankatm.id"/></td>
                    <td><s:property value="time"/></td>
                    <td><s:property value="description"/></td>
                    <td><s:property value="amount"/></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
