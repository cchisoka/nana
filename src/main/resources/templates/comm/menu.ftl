<#assign basePath = request.contextPath>
<aside class="main-sidebar">
    <input type="hidden" value="${menuActive!}" name="menu_active" >
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${basePath}/image/avatar.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>老大哥</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>统计分析</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class="active">
                        <a href="${basePath}/statistics/logList"><i class="fa fa-circle-o"></i>访问日志</a>
                    </li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-cog"></i> <span>系统管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li class="active">
                        <a href="${basePath}/user/list"><i class="fa fa-user-o"></i>用户管理</a>
                    </li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<script src="${basePath}/js/comm/menu.js"></script>