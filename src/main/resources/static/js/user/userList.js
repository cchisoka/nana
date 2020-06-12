var USERLIST = USERLIST || {};

(function (userList) {

    function _initUserTable() {
        userList.userTable = $("#user_table").bootstrapTable({
            url : Base.basePath + "/sysUser/list",
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
                    field : "userId",
                    visible:false
                },
                // {
                //     field : "phoneNumber",
                //     align : "center",
                //     title : "手机号"
                // },
                {
                    field : "userName",
                    align : "center",
                    title : "用户名"
                },
                {
                    field : "nickName",
                    align : "center",
                    title : "昵称"
                },
                {
                    field : "email",
                    align : "center",
                    title : "邮箱"
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
                        var optHtml = "<a class=\"edit\" href=\"javascript:void(0)\" title=\"编辑\"><i class=\"glyphicon glyphicon-edit\"></i></a>&nbsp;&nbsp;&nbsp;" +
                            "<a class=\"modify-pwd\" href=\"javascript:void(0)\" title=\"修改密码\"><i class=\"fa fa-key fa-fw\"></i></a>&nbsp;&nbsp;&nbsp;";
                        return optHtml;
                    },
                    events:
                        {
                            "click .edit": function (e, value, row, index) {_editHandler(row);},
                            "click .modify-pwd": function (e, value, row, index) {_updatePwd(row);}
                        }
                }
            ]
        });
    }

    function _initPage() {
        _initUserTable();
    }

    userList.initPage = _initPage;
})(USERLIST);


$(function () {
    USERLIST.initPage();
});