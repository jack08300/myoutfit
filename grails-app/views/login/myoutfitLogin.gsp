
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>My Outfit</title>
    <r:require modules="login"/>
    <r:layoutResources/>

</head>
<body>
    <div id="loginContent">
        <div class="content">
            <div class="logo"></div>
            <span class="logoTitle">My Outfit</span><span class="beta">Beta</span>
            <div class="welcomeContent">
                <div class="title">
                    Welcome to My Outfit!
                </div>
                <div class="content">
                    My Outfit helps you explore the world of beauty. <br/>
                    To show your value, keep up with friends, and upload discounts and gain unlimited rewards.
                </div>
                <div class="buttons">
                    <span class="login button">
                        Log In
                    </span>
                    <span class="indicator"> | </span>
                    <span class="signup button">
                        Sign Up
                    </span>
                </div>
            </div>
        </div>
    </div>
    <div id="loginPop" class="popup">
        <g:render template="loginPop"/>
    </div>

    <div id="signupPop" class="popup">
        <g:render template="signupPop"/>
    </div>
<r:layoutResources/>
</body>
</html>