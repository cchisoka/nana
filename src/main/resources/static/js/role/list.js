var ROLELIST = ROLELIST || {};

(function (roleList) {

    function _initRoleTable() {
        roleList.dataTable = $("#data_table").bootstrapTable({
            url : Base.basePath + "/sysRole/list",
            queryParams: function (params) {
                var param = {
                    offset: params.offset,
                    limit: params.limit
                    //,likeCon: $("#phone_number").val()
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
                    field : "roleId",
                    visible:false
                },
                {
                    field : "roleName",
                    align : "center",
                    title : "角色名"
                },
                {
                    field : "roleCode",
                    align : "center",
                    title : "角色编码"
                },
                {
                    field : "description",
                    align : "center",
                    title : "描述"
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
                },
                {
                    field : "opt",
                    align : "center",
                    title : "操作",
                    formatter: function (value, row , index) {
                        var optHtml = "<a class=\"edit\" href=\"javascript:void(0)\" title=\"编辑\"><i class=\"glyphicon glyphicon-edit\"></i></a>";
                        return optHtml;
                    },
                    events:
                        {
                            "click .edit": function (e, value, row, index) {_editHandler(row);}
                        }
                }
            ]
        });
    }

    function _initPage() {
        _initRoleTable();
    }

    roleList.initPage = _initPage;
})(ROLELIST);


$(function () {
    ROLELIST.initPage();
});
