
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="/css/style.css" />
</head>
<body>
    <!-- 这个是顶部栏，直接复制这段代码就行，记得放在body结点后面第一个 -->
    <div class="topBar">
        <div class="content-icon"><img class="icon" src="/icon/Down_white.png"/></div>
        <div class="content text text-light">学生成绩</div>
        <div class="content-icon"><img class="icon" src="/icon/Down_white.png"/></div>
    </div>

    <!-- 此处为按顶部栏右上角加号后的弹出选择栏，同理直接复制这段代码就行，默认是不可见的。
        若想显示则将结点中的 invisible 属性去掉即可，反之，加上 invisible 则不可见 -->
    <div class="popup">
        <div class="popup-row">
            <img class="popup-icon" src="/icon/Down_black.png"/>
            <span class="content text text-small popup-content">讨论课</span>
        </div>
        <div class="separator-dark"></div>
        <div class="popup-row">
            <img class="popup-icon" src="/icon/Down_black.png"/>
            <span class="content text text-small popup-content">讨论课</span>
        </div>
        <div class="separator-dark"></div>
        <div class="popup-row">
            <img class="popup-icon" src="/icon/Down_black.png"/>
            <span class="content text text-small popup-content">讨论课</span>
        </div>
    </div>

    <!-- 这个是蒙版，当弹出选择栏或者弹窗出现时请一并让蒙版出现 -->
    <div class="mask"></div>

    <!-- 这个是某些页面会出现的弹窗 -->
    <div class="dialog">
        <!-- 此处为弹窗头部，用于存储弹窗提示的内容，默认居中 -->
        <!-- 若结点有文本内容的，class 中必须要有 text 属性，该属性定义了 字体 字号 颜色 -->
        <div class="dialog-head text"><span>第二次讨论课报名次数</span></div>
        <!-- 这个 div 代表内容体中的一行 -->
        <div class="dialog-row">
            <span class="text">一班：</span>
            <!-- 这个是下拉选择框，如果要增加修改选项对 option 结点修改即可 -->
            <select class="selector">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
        </div>
        <div class="dialog-row">
            <span class="text">二班：</span>
            <select class="selector">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
        </div>
        <div class="dialog-row">
            <span class="text">三班：</span>
            <select class="selector">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
            </select>
        </div>
        <!-- 用于放置按钮 -->
        <div class="btnContainer">
            <!-- 对于所有的 button，必须在 class 中添加 btn 定义，该属性定义了 宽度 高度 边框 
            高度不建议改，若要自定义宽度，自行加一个定义了宽度的属性，如该处的 btn-big ，
            建议宽度定义用百分比，不然自适应会变形，已经预定义两种按钮样式(btn-green btn-white) -->
            <input class="btn btn-big btn-blue" type="button" value="取消"/>
            <input class="btn btn-big btn-blue right" type="button" value="确认"/>
        </div>
    </div>

    <!-- 对于所有页面中的内容，都是以卡片形式存放，card 属性定义了最高层 -->
    <div class="card">
        <!-- 每个卡片都存在一个卡片头，用于描述该卡片信息 -->
        <div class="card-head">
            <!-- 对于所有的文本信息，都放在 span 结点下，text 默认字体颜色为黑，text-light 则改为白
            对于卡片头的文本样式已预定好如浮动等属性，均在 card-head-content，直接用上就行 -->
            <span class="card-head-content text text-light">第一轮</span>
            <!-- 每个图标都必须用 icon 属性，这里已经为卡片头定义好了详细属性 content-icon 直接用 -->
            <div class="content-icon"><img class="icon" src="/icon/Down_white.png"/></div>
        </div>

        <!-- 对于卡片下的二级卡片，定义了 card-head-secondary -->
        <div class="card-head card-head-secondary">
            <span class="card-head-content text text-light">用例分析</span>
            <div class="content-icon"><img class="icon" src="/icon/Down_black.png"/></div>
        </div>

        <div class="card-body">
            <div>
                <div class="card-row-details">
                    <!-- 对于详细信息的文本，用 text-small，这个字号相比较与 text 小一号 -->
                    <span class="text text-small">展示：</span>
                    <span class="text score">5.0</span>
                    <span class="text text-small">提问：</span>
                    <span class="text score">5.0</span>
                    <span class="text text-small">书面报告：</span>
                    <span class="text score">5.0</span>
                    <span class="text score">5.0</span>
                </div>
                <!-- 分割线，要添加的地方直接添加如下代码即可 -->
                <div class="separator-dark"></div>
                <div class="card-row-details">
                    <input class="btn-blue btn" type="button" value="修改">
                    <span class="text text-small">本轮成绩：</span>
                    <span class="text score">5.0</span>
                </div>
            </div>
        </div>
    </div>

    <div>
        <!-- input 框 -->
        <input class="input text text-small" type="text" placeholder="学号"> 
    </div>

    <div>
        <!-- 占一行的按钮，用 btn-giant -->
        <input class="btn btn-giant btn-green" type="button" value="登录">
    </div>

    <input type="date" value="2018-09-01">

</body>
</html>