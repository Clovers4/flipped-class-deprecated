<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<!--顶部栏-->
<div class="topBar">
    <div class="content text text-light" style="width:100%">登陆</div>
</div>

<form action="/mobile/login" method="post">
    <div>
        <input name="account" class="input text text-small" type="text" placeholder="学号/教工号" style="margin-top:30px">
        <input name="password" class="input text text-small" type="password" placeholder="登陆密码" style="margin-top:10px">
    </div>

    <div>
        <span class="content text text-smallest text-black" style="margin-left:10%">初始默认登陆密码为123456</span>
    </div>

    <div>
        <input class="btn btn-giant btn-blue" type="submit" value="登录" style="margin-top:50px">
    </div>
</form>

<div>
    <a href="/find-password">
           <span class="content text text-small"
                 style="position:absolute;width:20%;right:20px">
            修改密码
       </span>
    </a>

</div>


</body>
</html>
