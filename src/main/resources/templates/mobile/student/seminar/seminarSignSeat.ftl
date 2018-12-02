<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Sign up seminar</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="/css/cr-style.css" />
        <script src="/js/jquery-3.3.1.js"></script>
    </head>
</head>
<body>
    <#assign title= "${course}讨论课">
    <#include "../studentTitle.ftl">

<div class="sign-up-seminard-whole-frame">

        <#list teams as team>
            <#if (team_index + 1) %2 ==1>
            <div class="sign-up-seminard-even">
                <span class = "sign-up-seminard-1-for2 sign-up-seminard-first-stage" >第${team_index+1}组:</span>
                <span class = "sign-up-seminard-2-for2 " id = seat${team_index}
                <#if team == "">
                style="cursor: pointer"
                </#if>
                >
                    <#if team != "">
                        ${team}
                    <#else>
                        可报名
                    </#if>
                </span>
            </div>

            <#elseif (team_index + 1) %2 ==0>
            <div class="sign-up-seminard-odd">
                <span class = "sign-up-seminard-1-for2 sign-up-seminard-first-stage">第${team_index+1}组:</span>
                <span class = "sign-up-seminard-2-for2 "  id = seat${team_index}
                 <#if team == "">
                style="cursor: pointer"
                 </#if>
                >
                    <#if team != "">
                        ${team}
                    <#else>
                        可报名
                    </#if>
                </span>
            </div>
            </#if>

        </#list>
</div>

<script>
    <#list teams as team>
        <#if team == "">
            $("#seat${team_index}").click(function () {
                var seat_id = ${team_index};
                $.post("/student/seminar/signSeat/chooseSeat",{ seat_id: seat_id },function(data){
                    if(data.state==true) {
                        alert("报名成功")
                        document.getElementById("seat" + ${team_index}).innerText = data.team_name
                        document.getElementById("seat" + ${team_index}).setAttribute("style", " cursor: text")
                        //document.getElementById("seat" + ${team_index}).onclick = function(){}
                    }
                    else {
                        alert("报名失败，你已经报名其他位置")
                    }
                })
            })
        </#if>
    </#list>
</script>

</body>
</html>
