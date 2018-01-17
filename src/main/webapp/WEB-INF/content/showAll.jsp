<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>用户列表</title>
    </head>
    <body>
        <center>
            <h2>用户列表</h2>
            <table border="1">
                <tr>
                    <td>用户ID</td>
                    <td>用户名</td>
                    <td>用户密码</td>
                    <td>是否删除</td>
                    <td>是否更新</td>
                </tr>
                <s:iterator value="#request.all" id="user">
                <tr>
                    <td><s:property value="#user.id"/></td>
                    <td><s:property value="#user.username"/></td>
                    <td><s:property value="#user.password"/></td>
                    <td><a href="delete.action?id=<s:property value='#user.id'/>">删除</a></td>
                    <td><a href="update.action?id=<s:property value='#user.id'/>">更新</a></td>
                </tr>
                </s:iterator>
            </table>
            <a href="add.action">添加用户</a>
        </center>
    </body>
</html>