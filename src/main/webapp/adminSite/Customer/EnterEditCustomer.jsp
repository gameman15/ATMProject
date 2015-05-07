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
        <form action="enterEdit" method="POST">
            <h1 class="title">Edit Customer Info</h1>

            <div class="row">
                <label class="col-md-2">Customer ID: </label>

                <input class="col-md-2" id="customerIdIn" name="customerId" type="text" placeholder="Enter ID">
            </div>
            <div>
                <s:fielderror name="customerId"/>
            </div>
            <input class="row col-md-2 btn btn-primary" type="submit"/>
        </form>
        <div class="text-danger">
            <s:fielderror name="customerId"/>
        </div>
    </body>
</html>
