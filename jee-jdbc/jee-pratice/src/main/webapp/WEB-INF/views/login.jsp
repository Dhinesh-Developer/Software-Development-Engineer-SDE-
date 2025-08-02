<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
</head>
<body>
    <div align="center">
        <h1>Employee Login Form</h1>
        
        <form action="<%=request.getContextPath()%>/login" method="post">
            <table>
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username" required></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" required></td>
                </tr>
            </table>
            <input type="submit" value="Login"/>
        </form>

        <p style="color:red;">
            <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
        </p>
    </div>
</body>
</html>
