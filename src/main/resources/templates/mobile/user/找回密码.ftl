
<#include "../head.ftl">
<body>
    <!--顶部栏-->
    <div class="topBar">
        <div class="content-icon"><img class="icon" src="/icon/Left_white.png"></div>
        <div class="content text text-light">找回密码</div>
     </div>
    <script>
        var wait=5;
        function time(obj) {

            if (wait == 0) {
                obj.removeAttribute("disabled")
                obj.style.color="red"
                obj.style.borderColor="red"
                obj.setAttribute("value","获取验证码")
                wait = 5;
            } else {
                obj.setAttribute("disabled","disabled")
                obj.style.color="grey"
                obj.style.borderColor="grey"
                obj.setAttribute("value",wait+"s")
                wait--;
                setTimeout(function() {
                            time(obj)
                        },
                        1000)
            }
        }
    </script>

    <div>
        <!-- input 框 -->
        <input class="input text text-small" id="account" type="text" placeholder="输入账号" style="margin-top:30px">
    
     <!-- input 框 -->
        <input class="input text text-small" id="password" type="password" placeholder="输入密码" style="margin-top:10px">

        <!-- input 框 -->
        <input class="input text text-small" id="password2" type="password" placeholder="确认密码" style="margin-top:10px">

    </div>

    <div>
        <span class="content text text-smallest text-black" style="text-align:left;line-height: 25px;color: red" >
            长度不小于6位，可包含数组、字母、下划线
       </span>
    </div>


    <div>
        <!-- input 框 -->
        <input class="input text text-small" type="text" id="yanzheng" placeholder="验证码" style="margin-top:10px;width:70%">
   
    <input class="btn btn-red text-bold text-smallest" type="button" value="获取验证码" style="width:25%;height:30px;" onclick="time(this)">
  
    </div>
        <input id="submit" class="btn btn-giant btn-blue text-small" type="button" value="确认提交" style="margin-top:60px">

<script>

    $("#submit").click(function(){
        var pwd1=$("#password").val();
        var pwd2=$("#password2").val();
        var account=$("#account").val();
        var yz=$("#yanzheng").val();
        if(pwd1!=pwd2||pwd1==null||pwd2==null||account==null||yz==null) {

            alert("请正确输入！");
        }
        else{
            $.post("/findPassword",{ account: account, password:pwd1,yanzheng:yz  },function(data){
                if(data.Result=="true"){
                    alert("修改成功！")
                    $(location).attr('href', '/logIn');
                }
                else{
                    alert(data.Message);
                }
            })
        }
    })

</script>

</body></html>