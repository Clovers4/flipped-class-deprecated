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

    <div class="ask-question-frame0">
        <span class="ask-question-1-for1 ask-question-frame0-text">${seminar_name}-<span style="color:#ff0000">第${present_team}组展示</span></span>
    </div>

        <#list teams as team>
            <#if (team_index + 1) %2 ==1>
            <div class="sign-up-seminard-even">
                <span class = "sign-up-seminard-1-for2 sign-up-seminard-first-stage">第${team_index+1}组:</span>
                <span class = "sign-up-seminard-2-for2 "
                <#if (team_index+1) == present_team>
                    style="color:red;font-size:16px;font-weight: bold"
                </#if>
                >
                    <#if team != "">
                        ${team}
                    <#else>
                        未报名
                    </#if>
                </span>
            </div>

            <#elseif (team_index + 1) %2 ==0>
            <div class="sign-up-seminard-odd">
                <span class = "sign-up-seminard-1-for2 sign-up-seminard-first-stage">第${team_index+1}组:</span>
                <span class = "sign-up-seminard-2-for2 "
                <#if (team_index+1) == present_team>
                    style="color:red;font-size:16px;font-weight: bold"
                </#if>
                >
                    <#if team != "">
                        ${team}
                    <#else>
                        未报名
                    </#if>
                </span>
            </div>
            </#if>

        </#list>


</div>

<input class="seminar-start-seminar-button" type="button" value = "提问" id = "askQuestion">

<script>
    $("#askQuestion").click(function(){
        $.ajax({
            type:"post",
            url:"/student/seminar/seminarPresentation/askQuestion",
            async:false,
            success:function(data){
                alert("提问成功！")
            $(location).attr('href', "/student/seminar/seminarPresentation");
            }
        })
    })
</script>




</body>
</html>
