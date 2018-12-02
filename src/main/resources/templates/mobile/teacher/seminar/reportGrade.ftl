<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Grade report</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="/css/cr-style.css" />
        <script src="/js/jquery-3.3.1.js"></script>
    </head>
</head>
<body>

<#assign title="${course}-书面报告">
    <#include "../teacherTitle.ftl">


    <div class="report-info-whole-frame">

        <#list reports as report>
            <#if (report_index+1) % 2 == 1>
                <div class="report-grade-frame-even">
                    <span class = "report-grade-1-for3 report-info-first-stage">第${report_index + 1}组:</span>
                    <span class = "report-grade-2-for3 " id = "report${report_index}">${report}</span>
                    <span class = "report-grade-3-for3 ">
                        <input type="text" id= "grade${report_index}" placeholder="成绩:" size="6">
                    </span>
                </div>
                <#elseif (report_index+1) % 2 == 0>
                <div class="report-grade-frame-odd">
                    <span class = "report-grade-1-for3 report-info-first-stage">第${report_index + 1}组:</span>
                    <span class = "report-grade-2-for3 " id = "report${report_index}">${report}</span>
                    <span class = "report-grade-3-for3 ">
                            <input type="text" id="grade${report_index}" placeholder="成绩:" size="6">
                    </span>
                </div>
            </#if>

        </#list>

    </div>

    <input class="seminar-start-seminar-button" type="button" value = "批量下载">
    <input class="seminar-modify-seminar-button" type="button" value = "确认" id = 'submitGrades'>

<script>

    <#list reports as report>

        <#if report != "">
            $("#report${report_index}").click(function () {
                var report_id = ${report_index};
                //console.log("report_id");
                // $.ajax({
                //     type:"post",
                //     url:"/teacher/seminarInfoPage/report/download",
                //     data: {field1:"field1",field2:1},
                //     dataType:"json",
                //     contentType:"application/json",
                //     async:false,
                //     success:function(data){
                //
                //     }
                // })
                $.post("/teacher/seminar/report/download",{ report_id: report_id },function(data){

                })
            })
        </#if>
    </#list>

    $("#submitGrades").click(function(){
        var grades = []
        for(var i = 0 ; i < ${reports?size} ; ++i){
            var data = document.getElementById("grade" + i).value
            if (!data)
            {
                data = -1
            }
            grades.push(data)
        }
        $.ajax({
            type:"post",
            url:"/teacher/seminar/report/grade",
            data : JSON.stringify(grades),
            //data:{gradeList:grades},
            dataType:"json",
            contentType:"application/json",
            async:false,
            //traditional: true,
            success:function(data){
                alert("成绩提交成功！")
                // $(location).attr('href', "/teacher/seminarInfoPage/report");
                for(var i = 0 ; i < ${reports?size} ; ++i){
                    document.getElementById("grade" + i).value = ""
                    grades=[]
                }
            }
        })
    })


</script>


</body>
</html>
