<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>更新用户</title>
    </head>
    <body>
        <center>
            <h2>更新用户</h2>
                <s:form action="userUpdate">
                    <s:set name="id" value="#parameters.id[0]"></s:set>
                    <s:textfield label="ID" name="id"></s:textfield>
                    <s:textfield label="用户名" name="username"></s:textfield>
                    <s:textfield label="密码" name="password"></s:textfield>
                    <s:submit value="更新"></s:submit>
                    <s:reset value="重置"></s:reset>
                </s:form>
        </center>
    </body>
</html>