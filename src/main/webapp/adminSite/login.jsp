
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

        <title>Login to Admin Portal</title>    
    </head>
    <body class="container-fluid">
        <h1>Admin Portal</h1>
        <div class="text-danger">
            <s:fielderror name="username"/>
        </div>
        <form action="AdminLogin" method="post">
            <div class="row">  
                <label class="col-xs-12 col-sm-6 col-md-2 col-lg-1">UserName: </label>
                <input class="col-xs-12 col-sm-6 col-md-2 col-lg-1" type="text" name="username" required/>
            </div>
            <br>
            <div class ="row">  
                <label class="col-xs-12 col-sm-6 col-md-2 col-lg-1">Password: </label>
                <input class="col-xs-12 col-sm-6 col-md-2 col-lg-1" type="password" name="password" required/>
            </div>
            <br>
            <input class="row col-xs-12 col-sm-6 col-md-2 col-lg-1 btn btn-primary" value="Log In" type="submit"/>
        </form>

    </body>
</html>
