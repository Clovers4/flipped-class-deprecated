<!DOCTYPE html>
<html>
<head lang="zh-cn">
    <meta charset="utf-8"/>
    <title>测试用网页</title>
</head>


<body>

<div style="width:800px;border:1px solid lightgray;margin:100px auto;padding:80px">
    <p>系统出现了异常，异常原因是：${exception!}
        <br/>
        出现异常的地址是：${url!}
        <br/>
        若刷新仍未解决问题，可联系管理员：XX@templab.online

        <!--TODO:修正为index-->
        <a href="/hello">点击跳回主页</a>
    </p>
</div>
</body>