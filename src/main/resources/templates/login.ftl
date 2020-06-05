<!DOCTYPE html>
<#assign basePath = request.contextPath>
<html>
<head>
    <!--引入公用的js和css文件 -->
<#include "/comm/lib.ftl"/>
    <link rel="stylesheet" type="text/css" href="${basePath}/css/login/login.css" />
    <script src="${basePath}/js//login/login.js"></script>
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <h2>账号管家</h2>
    </div>
    <div class="login-box-body">
        <form id="login_form">
            <div class="form-group has-feedback">
                <input value="" name="username" type="text" class="form-control" placeholder="用户名" maxlength="20">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input value="" name="password" type="password" class="form-control" placeholder="密码" maxlength="16">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <span class="error-msg"></span>
                </div>
                <div class="col-xs-12">
                    <button type="button" class="btn btn-primary btn-block btn-flat" id="login_btn">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>

