<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Enter Seminar (not begin)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="/css/cr-style.css" />
        <script src="/js/jquery-3.3.1.js"></script>
    </head>
</head>
<body>

    <#assign title= "${course}讨论课 - ${klass}">
    <#include "../teacherTitle.ftl">

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
            <a href="http://www.baidu.com"><span class = "seminar-info-3-for3 ">查看信息</span></a>
        </div>
    </div>

    <a href=
        <#if seminar.state == 0 > ""
        <#elseif seminar.state == 1>""
        <#elseif seminar.state == 2>"/teacher/seminarInfoPage/report"
        </#if>>
        <button class="seminar-start-seminar-button">
            <#if seminar.state == 0 >开始讨论课
            <#elseif seminar.state == 1>
            <#elseif seminar.state == 2>书面报告
            </#if>
        </button>

    </a>

    <input class="seminar-modify-seminar-button" type="button"
           <#if seminar.state == 0 >value = "修改讨论课信息"
           <#elseif seminar.state == 1>value = " "
           <#elseif seminar.state == 2>value = "查看成绩"
           </#if>>

     <#if seminar.state == 0 >
     <div class="seminar-delete-seminar-div">
         <input class="btn-giant seminar-delete-seminar-button" type="button" value = "删除该讨论课"/>
     </div>
     <#elseif seminar.state == 1>
     <#elseif seminar.state == 2>
     </#if>>

</body>
</html>