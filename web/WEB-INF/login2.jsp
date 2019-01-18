<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录</title>
    <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />
    <script type="text/javascript">
        function change() {
            var imageObj = document.getElementById("image");
            imageObj.src = "createImage?date="+new Date().getTime();
        }
    </script>
</head>
<body class="index">
<h1>${error}</h1>
<div class="login_box">
    <form action="check.action" method="post">
        <table>
            <tr>
                <td class="login_info">账号：</td>
                <td colspan="2"><input name="adminCode" value="<s:property value="adminCode"/>" type="text" class="width150" /></td>
                <td class="login_error_info"><span class="required">30长度的字母、数字和下划线</span></td>
            </tr>
            <tr>
                <td class="login_info">密码：</td>
                <td colspan="2"><input name="password" value="<s:property value="password"/>" type="password" class="width150" /></td>
                <td><span class="required">30长度的字母、数字和下划线</span></td>
            </tr>
            <tr>
                <td class="login_info">验证码：</td>
                <td class="width70"><input name="code" type="text" class="width70" /></td>
                <td><img src="createImage" alt="验证码" title="点击更换" id="image" onclick="change();"/></td>
                <td><span class="required"></span></td>
            </tr>
            <tr>
                <td></td>
                <td class="login_button" colspan="2">
                    <a href="javascript:document.forms[0].submit();"><img src="../images/login_btn.png" /></a>
                </td>
                <td><span class="required"><s:property value="errorMsg"/></span></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>