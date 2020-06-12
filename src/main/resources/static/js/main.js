var MAIN = MAIN || {};

(function () {


    //对bootstrapTable的补充
    //校核返回结果，如果session超时则弹框提示
    var _customBootstrapTableDefaults = {
        ajaxOptions: {haveLoadingMask:false}
        // ,paginationHAlign:"right"
        // ,paginationPreText:"<"
        // ,paginationNextText:">"
        ,contentType : "application/x-www-form-urlencoded; charset=utf-8"
        ,locale : "zh-CN"
        ,sidePagination : "server"
        ,pagination: true
        ,pageNumber: 1
        ,pageSize: 10
        ,method: "post"
        ,escape: true
    };
    $.extend($.fn.bootstrapTable.defaults, _customBootstrapTableDefaults);
    //console.log($.fn.bootstrapTable.defaults.ajax);
})(MAIN);