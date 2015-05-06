<%-- 
    Document   : checkDepositResults
    Created on : Apr 30, 2015, 11:50:35 AM
    Author     : DD5024435
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Atm Check Deposits</h1>
        Checks: <br>

        <table>


        </table>


        <s:iterator value="bank">
            <table>
                <tr>
                    <th>Date</th>
                    <th>ATMID</th> 
                    <th>Amount</th>
                    <th>CheckNumber</th>
                    <th>Description</th>
                </tr>
                <tr> 
                    <td>    <s:property value="time.getTime()"/></td>
                    <td>    <s:property value="bankatm.id"/></td>
                    <td>    <s:property value="amount"/></td>
                    <td>    <s:property value="checkNumber"/></td>
                    <td>    <s:property value="description"/> </td>
                </tr>

            </table>

        </s:iterator>



    </body>
</html>
