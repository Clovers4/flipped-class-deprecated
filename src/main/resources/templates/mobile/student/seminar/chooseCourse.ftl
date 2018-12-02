

<#include "../../head.ftl">
<body>

    <#assign title="选择课程">
    <#include "../studentTitle.ftl">

    <div class="card" style="margin-top:30px">
        <#list courseNames as courseName>
            <a>
                <div class="card-head">
                    <div class="content-icon"><img class="icon" src="/icon/course_white.png"/></div>
                    <span class="card-head-content card-head-haveicon text text-light"> ${courseName} </span>
                    <div class="content-icon"><img class="icon" src="/icon/right_white.png"/></div>
                </div>
            </a>


        <div class="separator-blank"></div>
    </#list>
    </div>

</body>
</html>