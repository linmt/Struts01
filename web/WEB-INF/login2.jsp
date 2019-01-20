<%@page pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body class="index">
<h1>${error}</h1>
<form action="check2.action" method="post">
    账号：<input name="user.adminCode" type="text"/></br>
    密码：<input name="user.password" type="password"/></br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>