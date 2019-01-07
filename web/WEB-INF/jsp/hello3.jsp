<%@page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body>
<h1>演示OGNL</h1>

<h1>1.访问基本属性</h1>
<h1>姓名：<s:property value="name"/></h1>
<h1>年龄：<s:property value="age"/></h1>
<h1>2.访问实体对象</h1>
<h1>账号：<s:property value="user.userName"/></h1>
<h1>3.访问数组和集合</h1>
<h1>数组：<s:property value="langs[1]"/></h1>
<h1>集合：<s:property value="cities[1]"/></h1>
<h1>4.访问Map</h1>
<h1>Map：<s:property value="map.shanghai"/></h1>
<h1>5.运算</h1>
<h1>age+10：<s:property value="age+10"/></h1>
<h1>介绍：<s:property value="'My name is '+name"/></h1>
<h1>6.调用方法</h1>
<h1>NAME：<s:property value="name.toUpperCase()"/></h1>
<h1>7.创建集合</h1>
<h1>集合：<s:property value="{'a','b','c'}"/></h1>
<h1>类型：<s:property value="{'a','b','c'}.getClass().getName()"/></h1>
<h1>8.创建Map</h1>
<h1>Map：<s:property value="#{'0':'男','1':'女'}"/></h1>
<h1>类型：<s:property value="#{'0':'男','1':'女'}.getClass().getName()"/></h1>

<br/><br/><br/><br/><br/>

<h1>演示ValueStack</h1>

<h1>1.debug标签</h1>
<p><s:debug/></p>

<h1>2.输出栈顶</h1>
<h1><s:property/></h1>

<h1>3.访问Map</h1>
<h1><s:property value="#action.user.userName"/></h1>
<h1><s:property value="user.userName"/></h1>

<h1>4.循环集合</h1>
<h1>
    <s:iterator value="users">
        <s:property value="userName"/>
    </s:iterator>
</h1>

<h1>5.循环数字</h1>
<h1>
    <s:iterator begin="1" end="totalPage" var="p">
        <s:if test="#p==currentPage">
            <font style="color:red;">
                <s:property value="#p"/>
            </font>
        </s:if>
        <s:else>
            <s:property value="#p"/>
        </s:else>
    </s:iterator>
</h1>
<h1>
    <s:iterator value="cities">
        <s:property/>
    </s:iterator>
    <s:iterator value="cities" var="p">
        <s:property value="#p"/>
    </s:iterator>
</h1>
</body>
</html>