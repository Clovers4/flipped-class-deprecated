<#include "../../head.ftl">
<body>
	<#assign title="课程管理">
    <#include "../teacherTitle.ftl">
<div class="card" style="margin-top:30px">
    
    <#list courses as course>

        <!--第一个头-->
        <div id="${course.id}">
            <div class="card-head">
                <div class="content-icon"><img class="icon" src="/icon/course_white.png"/></div>
                <span class="card-head-content card-head-haveicon text text-light"> ${course.name} </span>
                <div class="content-icon"><img class="icon" src="/icon/Down_white.png"/></div>
            </div>

            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">学生成绩</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>

            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">学生组队</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>
            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">课程信息</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>
            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">班级信息</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>
            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">讨论课设置</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>
            <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light" style="padding-left:20%;width: 65%;">共享设置</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>
            <div class="separator-blank"></div>
        </div>
    </#list>
</div>
</div>

<a href="/teacher/add">
    <div class="card-head" style="margin-top:50px;width:95%;margin-left:10px;">
        <div class="content-icon"><img class="icon" src="/icon/add_white.png"/></div>
        <span class="card-head-content text text-light card-head-haveicon ">新建课程</span>
        <div class="content-icon"><img class="icon" src="/icon/right_white.png"/></div>
    </div>
</a>

        <#list courses as course>
        <script>
            $("#${course.id} div:first").click(function () {
                $("#${course.id} div.card-head-secondary").toggle();
            });
        </script>
        </#list>

</body>

</html>