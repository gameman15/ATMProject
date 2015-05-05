<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <title>ATM Transaction Log</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
   
    </head>
    <body class="container-fluid">
        <h1> ATM Transaction Log </h1><br>
            
        
        <form action="AtmTransaction">
            
            <div class ="row">
                <label class="col-xs-6 col-sm-4 col-md-2 ">ATM ID:</label>
                <input class="col-xs-6 col-sm-4 col-md-2" type="number" name="atmId">
                </div>
            
            <div class="row text-danger "><s:fielderror name="invalidInput"/></div>
            
            
            
            <b class="row">Date Range: </b>
            
            <div class="row">
                <label class="col-xs-6 col-sm-4 col-md-2 " for="Log">From : </label>
                <input class="col-xs-6 col-sm-4 col-md-2 " id="meeting" type="date" name="beginDate"/>
            </div>
            <div class="row">
                <label class="col-xs-6 col-sm-4 col-md-2 " for="Log">To : </label>  
                <input class="col-xs-6 col-sm-4 col-md-2 " id="meeting" type="date" name="endDate"/>
            </div>
            
            <i class="row text-info">*Leave blank for all transactions*</i>
            <br><br>
            <input class="row col-xs-12 col-sm-6 col-md-2 btn btn-primary" type="submit"/>
        </form>
        
        <br><br><br>
        
        <table class="table table-striped table-bordered">
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
