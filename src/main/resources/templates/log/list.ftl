<!DOCTYPE html>
<#assign basePath = request.contextPath>
<html>
<head>
    <!--引入公用的js和css文件 -->
    <#include "../comm/lib.ftl"/>
    <script src="${basePath}/js/log/logList.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <!-- header -->
    <#include "../comm/header.ftl"/>

    <!-- menu -->
    <#include "../comm/menu.ftl"/>

    <!-- content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>访问日志</h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i></a></li>
                <li class="active">访问日志</li>
            </ol>
        </section>

        <section class="content">
            <div>
                <div class="search-box">
                    <form class="form-inline">
                        <div class="form-group">
                            <label for="user_name">用户名</label>
                            <input type="text" name="user_name" class="form-control" id="user_name" maxlength="20" />
                        </div>
                        <button type="button" class="btn btn-primary" data-control="search">查询</button>
                        <button type="button" class="btn btn-primary" data-control="reset">重置</button>
                    </form>
                </div>
            </div>
            <div class="content-table-box">
                <div class="opt-box box-header">
                    <h3 class="box-title">日志列表</h3>
                    <div class="pull-right">
                    </div>
                </div>
                <div class="table-box box-body">
                    <table id="log_table"></table>
                </div>
            </div>
        </section>
    </div>

    <!-- footer -->
    <#include "../comm/footer.ftl"/>

</div>
</body>
</html>
