<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>View Seminar</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="/css/cr-style.css" />
        <script src="/js/jquery-3.3.1.js"></script>
    </head>
</head>
<body>
    <#assign title= "${course}讨论课">
    <#include "../studentTitle.ftl">

<div class="seminar-info-whole-frame">

    <div class="seminar-info-frame_1">
        <span class = "seminar-info-1-for2 seminar-info-first-stage">主题:</span>
        <span class = "seminar-info-2-for2 ">${seminar.topic}</span>
    </div>

    <div class="seminar-info-frame_2_4">
        <span class = "seminar-info-1-for2 seminar-info-first-stage">课次序号:</span>
        <span class = "seminar-info-2-for2 ">未改</span>
    </div>

    <div class="seminar-info-frame_3">
        <span class = "seminar-info-1-for2 seminar-info-first-stage">要求:</span>
        <span class = "seminar-info-2-for2 ">${seminar.intro}</span>
    </div>

    <div class="seminar-info-frame_2_4">
        <span class = "seminar-info-1-for3 seminar-info-first-stage">课程情况:</span>
        <span class = "seminar-info-2-for3 ">
            <#if seminar.state == 0 >未开始
            <#elseif seminar.state == 1>正在进行
            <#elseif seminar.state == 2>已完成
            </#if>
        </span>
        <a href="/student/seminar/seminarInfo"><span class = "seminar-info-3-for3 ">查看信息</span></a>
    </div>

    <div class="seminar-info-frame5">
        <span class = "seminar-info-1-for2 seminar-info-first-stage">轮次:</span>
        <span class = "seminar-info-2-for2 ">第 未做 轮</span><br>
        <span class = "seminar-info-1-for2 seminar-info-first-stage">报名时间:</span>
        <span class = "seminar-info-2-for2 ">${seminar.signUpStartTime?string("yyyy.MM.dd HH:mm:ss")}</span><br>
        <span class = "seminar-info-1-for2 seminar-info-first-stage">截至时间:</span>
        <span class = "seminar-info-2-for2 ">${seminar.signUpEndTime?string("yyyy.MM.dd HH:mm:ss")}</span>

    </div>

</div>

<#if seminar.state != 2>
        <a href=
            <#if seminar.state == 0 > "/student/seminar/signSeat"
            <#elseif seminar.state == 1>"/student/seminarInfoPage/seminarPresentation"
            </#if>>
            <button class="seminar-start-seminar-button">
                        <#if seminar.state == 0 >报名
                        <#elseif seminar.state == 1>进入讨论课
                        </#if>
            </button>

        </a>
</#if>




</body>
</html>