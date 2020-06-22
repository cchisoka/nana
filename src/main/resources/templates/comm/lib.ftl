<#assign basePath = request.contextPath>
<meta charset="utf-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<link rel="shortcut icon" href="${basePath}/image/comm/logo.ico" type="image/x-icon" />
<title>账号管家</title>
<!-- Tell the browser to be responsive to screen width -->
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="${basePath}/plugin/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="${basePath}/plugin/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="${basePath}/plugin/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="${basePath}/plugin/adminlte/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="${basePath}/plugin/adminlte/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
<!-- Google Font -->
<#--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">-->

<script src="${basePath}/plugin/jquery/3.3.1/jquery-3.3.1.js"></script>
<#--<script src="${basePath}/plugin/jquery/1.9.1/jquery.min.js"></script>-->


<script src="${basePath}/plugin/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${basePath}/plugin/adminlte/dist/js/adminlte.min.js"></script>

<!--bootstrap table-->
<link type="text/css" rel="stylesheet" href="${basePath}/plugin/bootstrap-table-master/dist/bootstrap-table.min.css">
<script src="${basePath}/plugin/jquery/jquery-treegrid/js/jquery.treegrid.min.js"></script>

<script type="text/javascript" src="${basePath}/plugin/bootstrap-table-master/dist/bootstrap-table.min.js"></script>
<script type="text/javascript" src="${basePath}/plugin/bootstrap-table-master/dist/locale/bootstrap-table-zh-CN.min.js"></script>

<link type="text/css" rel="stylesheet" href="${basePath}/plugin/jquery/jquery-treegrid/css/jquery.treegrid.css">


<script src="${basePath}/plugin/bootstrap-table-master/dist/extensions/treegrid/bootstrap-table-treegrid.min.js"></script>


<!-- iCheck 1.0.1 -->
<script src="${basePath}/plugin/icheck-1.x/icheck.min.js"></script>
<link rel="stylesheet" href="${basePath}/plugin/icheck-1.x/skins/all.css">

<!-- jQuery拖动插件-->
<script type="text/javascript" src="${basePath}/plugin/jquery/draggabilly/draggabilly.pkgd.min.js"></script>

<#--jquery zTree-->
<link rel="stylesheet" href="${basePath}/plugin/jquery/zTree_v3-master/css/metroStyle/metroStyle.css" >
<script src="${basePath}/plugin/jquery/zTree_v3-master/js/jquery.ztree.all.js"></script>

<link rel="stylesheet" href="${basePath}/css/main.css">

<script src="${basePath}/js/main.js"></script>

<script type="text/javascript">
    var Base = Base || {};
    (function (base) {
        /** 项目根路径 */
        base.basePath = "${basePath}";
        /** ajax请求超时时间 */
        base.ajaxTimeout = 60000;
    })(Base);
</script>
