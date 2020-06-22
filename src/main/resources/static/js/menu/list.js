var MENULIST = MENULIST || {};

(function (menuList) {
    function _initMenuTable() {
        var $table = $("#data_table");

        $table.bootstrapTable({
            //url: '/json/treegrid.json',
            url: Base.basePath + "/sysMenu/list",
            //method: "get",
            striped: true,
            sidePagination: 'server',
            pagination: false,
            idField: 'menuId',
            treeEnable: true,
            //showColumns: true,
            responseHandler: function(result) {
                return result.data;
            },
            columns: [
                {
                    field: 'ck',
                    checkbox: true
                },
                {
                    field: 'menuName',
                    title: '名称'
                },
                {
                    field: 'menuType',
                    title: '类型',
                    align: 'center',
                    formatter: _typeFormatter
                },
                {
                    field: 'code',
                    title: '权限值'
                }
            ],
            rootParentId: 0,
            treeShowField: 'menuName',
            parentIdField: 'pid',
            onPostBody: function() {
                var columns = $table.bootstrapTable('getOptions').columns

                if (columns && columns[0][1].visible) {
                    $table.treegrid({
                        treeColumn: 1,
                        onChange: function() {
                        }
                    })
                }
            }
            // bootstrap-table-treetreegrid.js 插件配置 -- end
        });
    }

    function _typeFormatter(value, row, index) {
        if (value === 1) {
            return '目录'
        }
        if (value === 2) {
            return '菜单'
        }
        if (value === 3) {
            return '按钮'
        }
        return '-'
    }


    function _initPage() {
        _initMenuTable();
    }
    menuList.initPage = _initPage;
})(MENULIST);

$(document).ready(function () {
    MENULIST.initPage();
});
