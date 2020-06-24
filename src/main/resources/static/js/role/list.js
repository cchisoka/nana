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
                        var optHtml = "<a class=\"edit\" href=\"javascript:void(0)\" title=\"编辑\"><i class=\"glyphicon glyphicon-edit\"></i></a>&nbsp;&nbsp;&nbsp;"
                            + "<a class=\"allot-auth\" href=\"javascript:void(0)\" title=\"分配权限\"><i class=\"glyphicon glyphicon-cog\"></i></a>&nbsp;&nbsp;&nbsp;";
                        return optHtml;
                    },
                    events:
                        {
                            "click .edit": function (e, value, row, index) {_editHandler(row);},
                            "click .allot-auth": function (e, value, row, index) {_allotAuth(row);}
                        }
                }
            ]
        });
    }

    function _allotAuth(row) {
        $("#allot_auth_dlg").find("input[name='roleId']").val(row.roleId);
        roleList.index = layer.open({
            type: 1,
            title: "权限分配",
            area: ['600px', '360px'],
            shadeClose: true, //点击遮罩关闭
            content: $("#allot_auth_dlg"),
            btn: ['保存', '取消'],
            yes: function (index, layero) {
                _allotAuthHandler();
            },
            btn2: function (index, layero) {

                //return false 开启该代码可禁止点击该按钮关闭
            },
            cancel: function () {
                //右上角关闭回调
                //return false 开启该代码可禁止点击该按钮关闭
            }
        });

        $.ajax({
            url: Base.basePath + "/sysMenu/getRoleMenuIdList",
            type: "get",
            cache: false,
            async: true,
            dataType: "json",
            data: {
                roleId: row.roleId
            },
            success: function (result) {
                if (result.code !== 200 ) {
                    layer.msg(result.message);
                    return;
                }
                var menuIds = result.data;
                var treeObj = $.fn.zTree.getZTreeObj("auth_tree");
                var nodes = _getAllNodes(treeObj.getNodes());
                if (menuIds) {
                    var i, j;
                    for(i = 0; i < nodes.length; i++) {
                        for (j = 0; j < menuIds.length; j++) {
                            if (nodes[i].id === menuIds[j]) {
                                treeObj.checkNode(nodes[i], true, false);
                                break;
                            }
                        }
                    }

                }

            }
        })
    }

    function _getAllNodes(nodes) {
        if (!nodes && nodes.length == 0) {
            return;
        }
        var nodeList = nodes;
        for (var i = 0; i < nodes.length; i++) {
            var node = nodes[i];
            if (node.children) {
                nodeList = nodeList.concat(_getAllNodes(node.children));
            }
        }
        return nodeList;
    }

    function _allotAuthHandler() {
        var treeObj = $.fn.zTree.getZTreeObj("auth_tree");
        var nodes = treeObj.getCheckedNodes(true);
        if (nodes.length === 0) {
            layer.msg("请选择要分配的权限");
            return;
        }
        var ids = [] ;
        $.each(nodes, function (index, node) {
            ids.push(node.id);
        });
        var roleId = $("#allot_auth_dlg").find("input[name='roleId']").val();

        $.ajax({
            url: Base.basePath + "/sysMenu/allot",
            type: "POST",
            async: true,
            cache: false,
            data: {ids: ids, roleId: roleId},
            dataType: "json",
            success: function (result) {
                if (result.code !== 200 ) {
                    layer.msg(result.message);
                    return;
                }
                layer.close(roleList.index);
                layer.msg("保存成功",{
                    time: 2000
                });
            }
        });
    }

    function _getTreeData() {
        $.ajax({
            url: Base.basePath + "/sysMenu/getMenuTree",
            type: "POST",
            async: true,
            cache: false,
            data: {},
            dataType: "json",
            success: function (result) {
                if (result.code !== 200 ) {
                    layer.msg(data.message);
                    return;
                }
                _initZTree(result.data)
            }
        });
    }

    function _initZTree(nodes) {
        var setting = {
            check: {
              enable: true
            },
            data: {
                simpleData: {
                    enable: true,
                    rootPId: 0
                }
            }
        };

        $.fn.zTree.init($("#auth_tree"), setting, nodes);
    }

    function _initPage() {
        _initRoleTable();
        _getTreeData();
    }

    roleList.initPage = _initPage;
})(ROLELIST);


$(function () {
    ROLELIST.initPage();
});
