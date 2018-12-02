 <div class="topBar">
        <div class="content-icon"><img class="icon" src="/icon/back_white.png"/></div>
        <div class="content text text-light">
        	${title}
        </div>
        <div class="content-icon" id="info"><img class="icon" src="/icon/menu.png"/></div>
    </div>

    <div class="popup " style="display: none">

        <a href="/student/person">
        <div class="popup-row">
            <img class="popup-icon" src="/icon/user_blue.png"/>
            <span class="content text text-small popup-content">个人</span>
        </div>
        </a>
        
        <div class="separator-dark"></div>
        
        <a href="/student/seminar/chooseCourse">
        <div class="popup-row">
            <img class="popup-icon" src="/icon/seminar_blue.png"/>
            <span class="content text text-small popup-content">讨论课</span>
        </div>
        </a>
    </div>
    <script>
        $("#info").click(function(){
        $(".popup").toggle();
    });
    </script>