<!DOCTYPE html>
<#assign basePath = request.contextPath>
<html>
<head>
    <!--引入公用的js和css文件 -->
<#include "./comm/lib.ftl"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <!-- header -->
<#include "./comm/header.ftl"/>

    <!-- menu -->
<#include "./comm/menu.ftl"/>

    <!-- content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                首页
            </h1>
        </section>

        <section class="content">
            首页
        </section>
    </div>

    <!-- footer -->
<#include "./comm/footer.ftl"/>

</div>
</body>
</html>
