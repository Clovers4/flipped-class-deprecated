

<#include "../../head.ftl">
<body>
<#assign title="选择课程">
    <#include "../teacherTitle.ftl">

<div class="card" style="margin-top:30px">
 <#list courseNames as courseName>
           <a>
            <div class="card-head">
                <div class="content-icon"><img class="icon" src="/icon/course_white.png"/></div>
                <span class="card-head-haveicon card-head-content text text-light">${courseName}</span>
                <div class="content-icon"><img class="icon" src="/icon/right_white.png"/></div>
            </div>
           </a>
     <div class="separator-blank"></div>
 </#list>
</div>

    <div style="margin-top:50px">
        <div>
            <!-- 占一行的按钮，用 btn-giant -->
            <input class="btn btn-big btn-red" type="button" value="正在进行讨论课" style="margin-left:60%;height: 30px;">
        </div>
    </div>

</body>
</html>