
<#include "../head.ftl">
<body>
    <!--顶部栏-->
    <div class="topBar">
            <div class="content text text-light" style="width:100%">登陆</div>
    </div>


    <div>
        <!-- input 框 -->
        <input id="account" class="input text text-small" type="text" placeholder="学号/教工号" style="margin-top:30px">
    
     <!-- input 框 -->
        <input id="password" class="input text text-small" type="password" placeholder="登陆密码" style="margin-top:10px">
    
    </div>

    <div>
        <span class="content text text-smallest text-black" style="margin-left:10%" >
            初始默认登陆密码为123456
       </span>
    </div>
    
    <div>
        <input class="btn btn-giant btn-blue" type="button" id="submit" value="登录" style="margin-top:50px">
    </div>


   <div>
       <a href="/findPassword">
           <span class="content text text-small"
                 style="position:absolute;width:20%;right:20px">
            修改密码
       </span>
       </a>

   </div>
    <script>

        $("#submit").click(function(){
            var pwd=$("#password").val();
            var account=$("#account").val();
            if(pwd==null||account==null) {
                alert("请正确输入！");
            }
            else{
                $.post("/logIn",{ account: account, password:pwd },function(data){
                    if(data.State=="true"){
                        alert("登陆成功！")
                        $(location).attr('href', '/'+data.User+'/person');
                    }
                    else{
                        alert("登陆失败！"+data.Message);
                    }
                })
            }
        })

    </script>

</body></html>