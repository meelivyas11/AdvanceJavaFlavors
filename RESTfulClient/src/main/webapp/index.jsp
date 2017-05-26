<html>
<body>
<h2>Add Users</h2>

<form action="UserServ" method="post">
     UserName: <input type="text" name="username"><br>
     Password:<input type="text" name="password"><br>
     <input type="submit" value="Add User">
</form>

<h2>Get Users</h2>
<form action="UserServ" method="get">
    <input type="submit" value="Get All Users">
</form>
</body>
</html>
