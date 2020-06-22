<!DOCTYPE html>
<#assign basePath = request.contextPath>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ID Manager</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="${basePath}/plugin/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${basePath}/plugin/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${basePath}/plugin/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${basePath}/plugin/adminlte/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${basePath}/plugin/icheck-1.x/skins/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Google Font -->
    <#--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">-->
    <link rel="stylesheet" href="${basePath}/css/login/login.css">
</head>
<body class="hold-transition login-page" onload="document.loginForm.username.focus();">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>ID</b> Manager</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登录</p>

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
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 记住我
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>
    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<script src="${basePath}/plugin/jquery/1.9.1/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="${basePath}/plugin/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="${basePath}/plugin/icheck-1.x/icheck.min.js"></script>
<script src="${basePath}/js/login/login.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
    });
</script>
</body>
</html>

