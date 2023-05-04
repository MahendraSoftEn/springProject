<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Login Screen</title>
</head>
<body>
      <div style={{text-align:"center"}}>
         <h1>Welcome To Login Form</h1>
         
         <form action="processform" method="post">
           <label>User Name:</label>
           <input  type="text" name="username" /><br><br>
           <label>Email:</label>
           <input type="email" name="email" /><br><br>
           <label>Password:</label>
           <input type="password"  name="password" /><br><br>
           <input type="submit" />
         </form>
         
      </div>
      
</body>
</html>