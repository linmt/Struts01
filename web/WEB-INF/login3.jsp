<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript">
        function change() {
            var imageObj = document.getElementById("image");
            imageObj.src = "createImage?date="+new Date().getTime();
        }
    </script>
</head>
<body>
<form action="check.action" method="post">
    账号：<input name="adminCode" type="text"/></br>
    密码：<input name="password" type="password"/></br>
    验证码：<input name="code" type="text" class="width70" /><img src="createImage" alt="验证码" title="点击更换" id="image" onclick="change();"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>