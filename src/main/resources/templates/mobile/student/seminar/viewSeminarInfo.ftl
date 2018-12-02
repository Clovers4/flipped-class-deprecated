<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>View seminar - seminar info</title>
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
                <span class = "sign-up-seminard-1-for2 sign-up-seminard-first-stage">第${team_index+1}组:</span>
                <span class = "sign-up-seminard-2-for2 ">
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
                <span class = "sign-up-seminard-2-for2 ">
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

</body>
</html>
