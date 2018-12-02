
<#include "../../head.ftl">
<body>

    <#assign title="查看课程">
    <#include "../studentTitle.ftl">

    <div class="card" style="margin-top:30px">
            <#list courseIds as courseId>
                <div id="${courseId}" >
        <div class="card-head">
                <div class="content-icon"><img class="icon" src="/icon/course_white.png"/></div>
            <span class="card-head-content card-head-haveicon text text-light" > ${courseNames[courseId_index]} </span>
            <div class="content-icon"><img class="icon" src="/icon/Down_white.png"/></div>
        </div>

        <div class="card-head card-head-secondary" style="display: none">
                <span class="card-head-content text text-light"style="padding-left:20%;width: 65%;">我的成绩</span>
                <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
            </div>

            <div class="card-head card-head-secondary" style="display: none">
                    <span class="card-head-content text text-light"style="padding-left:20%;width: 65%;">我的组队</span>
                    <div class="content-icon"><img class="icon" src="/icon/Right_white.png"/></div>
                </div>
        <div class="separator-blank"></div>
                </div>
    </#list>

    </div>

</body>
</html>