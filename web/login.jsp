<%-- 
    Document   : login
    Created on : Jul 8, 2022, 1:01:14 PM
    Author     : Duc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Login Form</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            body {
                background: #f9ece6;
            }
            .login-form {
                width: 340px;
                margin: 50px auto;
                font-size: 15px;
            }
            .login-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .login-form h2 {
                margin: 0 0 15px;
            }
            .form-control, .btn {
                min-height: 38px;
                border-radius: 2px;
            }
            .btn {        
                font-size: 15px;
                font-weight: bold;
            }
            .btn-primary {
                color: #fff;
                background-color: #f89cab;
                border-color: #f89cab;
            }
            .float-right {
                float: right!important;
                color: #f89cab;
            }
            .text-center {
                text-align: center!important;
                color: #f89cab;
            }
            .text-center a{
                color: #f89cab;
            }
            .float-right:hover {
                color: #f89cab;
            }
            .btn-primary:hover {
                background-color: #f89cab;
            }
        </style>
    </head>
    <body>
        <div class="login-form">
            <form action="/login" method="post">
                <h2 class="text-center">Log in</h2>       
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="Username" required="required">
                </div>
                <div class="form-group">
                    <input type="password" name="password" class="form-control" placeholder="Password" required="required">
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">Log in</button>
                </div>
                <div class="clearfix">
                    <label class="float-left form-check-label"><input type="checkbox"> Remember me</label>
                    <a href="#" class="float-right" color="#f89cab">Forgot Password?</a>
                </div>        
            </form>
            <p class="text-center"><a href="register.jsp">Create an Account</a></p>
        </div>
    </body>
</html>