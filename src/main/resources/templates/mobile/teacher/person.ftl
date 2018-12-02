<#include "../head.ftl">
<body>
   
	<#assign title="个人">
    <#include "teacherTitle.ftl">

<div class="content"
     style="background-color:white;margin-top:10px;height:120px;margin-left: 5px;width:95%">
        <span class="content text text-small popup-content" style="margin-top:80px;">
        ${teacher.account!}
        </span>
</div>


<div class="card" style="margin-top:160px">
    <a href="/teacher/course">
        <div class="card-head">
            <div class="content-icon"><img class="icon" src="/icon/course_white.png"/></div>
            <span class="card-head-haveicon card-head-content text text-light">我的课程</span>
            <div class="content-icon"><img class="icon" src="/icon/right_white.png"/></div>
        </div>
    </a>


    <div class="separator-blank"></div>

    <a href="/teacher/setting">
        <div class="card-head">
            <div class="content-icon"><img class="icon" src="/icon/setting_white.png"/></div>
            <span class="card-head-content text text-light card-head-haveicon ">账户与设置</span>
            <div class="content-icon"><img class="icon" src="/icon/right_white.png"/></div>
        </div>
    </a>
</div>

</body>
</html>