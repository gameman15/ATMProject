<%-- 
    Document   : SearchCustomer
    Created on : May 4, 2015, 1:57:24 PM
    Author     : JD5024446
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Search</title>
    </head>
    <body>

        <form action="search" method="POST">
            <h1 class="title">Search for Customer</h1>
            <table id="searchForCustomer"  class="form">
                <tr>
                    <th class="1">
                        Customer Name:
                    </th>
                    <th class="2">
                        <input id ="customerNameIn" name="customerName" type="text" placeholder="Enter Customer Name">
                    </th>
                </tr>
                <tr>
                    <th></th>
                    <th class="button1">
                        <button id="submit" name="submit" type="submit" value="Submit">Submit</button>
                    </th>
                </tr>
            </table>
            <br><br><br>

            <table class="table table-bordered table-striped">
                <tr>
                    <td>ID</td>
                    <td>NAME</td>
                    <td>EMAIL</td>
                    <td>ADDRESS</td>
                    <td>CITY</td>
                    <td>STATE</td>
                </tr>
                <s:iterator value="searchResults">
                    <tr>
                        <td><s:property value ="id"/></td>
                        <td><s:property value="name"/></td>
                        <td><s:property value="email"/></td>
                        <td><s:property value="address"/></td>
                        <td><s:property value="city"/></td>
                        <td><s:property value="state"/></td>
                    </tr>
                </s:iterator>
            </table>
        </form>
    </body>
</html>
