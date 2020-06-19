<!DOCTYPE html>
<#assign basePath = request.contextPath>
<html lang="zh">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>账号管家</title>
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="${basePath}/plugin/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${basePath}/plugin/adminlte/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="${basePath}/css/login/login.css">
</head>
<body class="hold-transition login-page" onload="document.loginForm.username.focus();">
<div class="login-box">
    <div class="login-logo">
        <h2>账号管家</h2>
    </div>
    <div class="login-box-body">
        <form id="login_form" action="/doLogin" method="post" name="loginForm" onsubmit="return LOGIN.validateForm();">
            <div class="form-group has-feedback">
                <input value="" name="username" type="text" class="form-control" placeholder="用户名" maxlength="20">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input value="" name="password" type="password" class="form-control" placeholder="密码" maxlength="16">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="info">
                <#if RequestParameters.error?? >
                    <span class="error" id="error_span">${(Session.SPRING_SECURITY_LAST_EXCEPTION.message)!}</span>
                </#if>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <span class="error-msg"></span>
                </div>
                <div class="col-xs-12">
                    <button type="submit" class="btn btn-primary btn-block btn-flat" id="login_btn">登录</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script src="${basePath}/plugin/jquery/1.9.1/jquery.min.js"></script>
<script src="${basePath}/js/login/login.js"></script>
</html>

