var LOGLIST = LOGLIST || {};

(function (logList) {

    function _initLogTable() {
        logList.logTable = $("#log_table").bootstrapTable({
            url : Base.basePath + "/sysLog/list",
            queryParams: function (params) {
                var param = {
                    offset: params.offset,
                    limit: params.limit
                    ,userName: $("#user_name").val()
                }
                return param;
            },
            responseHandler: function(result) {
                return {
                    'total':result.data.total,
                    'rows':result.data.list
                };
            },
            columns: [
                {
                    checkbox:true
                },
                {
                    field : "userid",
                    visible:false
                },
                {
                    field : "userName",
                    align : "center",
                    title : "用户名"
                },
                {
                    field : "uri",
                    align : "center",
                    title : "URI"
                },
                {
                    field : "method",
                    align : "center",
                    title : "请求类型"
                },
                {
                    field : "spendTime",
                    align : "center",
                    title : "花费时间"
                },
                {
                    field : "createTime",
                    align : "center",
                    title : "创建时间"
                },
                {
                    field : "updateTime",
                    align : "center",
                    title : "更新时间"
                }
            ]
        });
    }

    function _initPage() {
        _initLogTable();
    }

    logList.initPage = _initPage;
})(LOGLIST);


$(function () {
    LOGLIST.initPage();
});
