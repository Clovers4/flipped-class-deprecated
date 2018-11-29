<!DOCTYPE html>
<html>
<head lang="zh-cn">
    <meta charset="utf-8"/>
    <title>翻转课堂 - 管理员</title>
</head>

<body>

<h1>管理员-列表</h1>
<table>
    <tr>
        <th>id</th>
        <th>账号</th>
        <th>密码</th>
    </tr>
	<#list admins as admin>
		<tr>
            <td>${admin.id}</td>
            <td>${admin.account}</td>
            <td>${admin.password}</td>
        </tr>
    </#list>
</table>


</body>

</html>