<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>Add New Customer</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    
</head>
<body class="container-fluid">
        
    <h1 class="title">Enter New Customer</h1>

    <form id="addCus" action="addCustomer" method="POST">
        <div class ="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin ID#:</label>
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerNameIn" name="adminId" type="number" placeholder="Enter ID#" required>
        </div>
        <div class ="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin Name:</label>
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerNameIn" name="adminName" type="text" placeholder="Enter Name" required>
        </div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin Address:</label>
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerAddressIn" name="adminAddress" type="text" placeholder="Enter Address" required>
        </div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin City:</label>
               
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerCityIn" name="adminCity" type="text" placeholder="Enter City" required>
        </div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin State:</label>
                
            <select class="col-xs-12 col-sm-6 col-md-2" id="customerStateIn" name="adminState" required>
                        <option value="-">-</option>
                        <option value="AL">AL</option>
                        <option value="AK">AK</option>
                        <option value="AZ">AZ</option>
                        <option value="AR">AR</option>
                        <option value="CA">CA</option>
                        <option value="CO">CO</option>
                        <option value="CT">CT</option>
                        <option value="DE">DE</option>
                        <option value="DC">DC</option>
                        <option value="FL">FL</option>
                        <option value="GA">GA</option>
                        <option value="HI">HI</option>
                        <option value="ID">ID</option>
                        <option value="IL">IL</option>
                        <option value="IN">IN</option>
                        <option value="IA">IA</option>
                        <option value="KS">KS</option>
                        <option value="KY">KY</option>
                        <option value="LA">LA</option>
                        <option value="ME">ME</option>
                        <option value="MD">MD</option>
                        <option value="MA">MA</option>
                        <option value="MI">MI</option>
                        <option value="MN">MN</option>
                        <option value="MS">MS</option>
                        <option value="MO">MO</option>
                        <option value="MT">MT</option>
                        <option value="NE">NE</option>
                        <option value="NV">NV</option>
                        <option value="NH">NH</option>
                        <option value="NJ">NJ</option>
                        <option value="NM">NM</option>
                        <option value="NY">NY</option>
                        <option value="NC">NC</option>
                        <option value="ND">ND</option>
                        <option value="OH">OH</option>
                        <option value="OK">OK</option>
                        <option value="OR">OR</option>
                        <option value="PA">PA</option>
                        <option value="RI">RI</option>
                        <option value="SC">SC</option>
                        <option value="SD">SD</option>
                        <option value="TN">TN</option>
                        <option value="TX">TX</option>
                        <option value="UT">UT</option>
                        <option value="VT">VT</option>
                        <option value="VA">VA</option>
                        <option value="WA">WA</option>
                        <option value="WV">WV</option>
                        <option value="WI">WI</option>
                        <option value="WY">WY</option>
                    </select>				
        </div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin Username</label>
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerEmailIn" name="adminUsername" type="text" placeholder="Enter password">
        </div>
        <div class="row">
            <label class="col-xs-12 col-sm-6 col-md-2">Admin Password:</label>
            <input class="col-xs-12 col-sm-6 col-md-2" id="customerEmailIn" name="adminPass" type="text" placeholder="Enter password">
        </div>
        <div class="btn-group">
            <button class=" btn btn-primary" id="cancel" name="cancel" value="Cancel">Cancel</button>
            <button class=" btn btn-primary" id="submit" name="submit" type="submit" value="Submit">Submit</button>
        </div>
                
    </form>

</body>
</html>