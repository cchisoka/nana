var AdminMenu = AdminMenu || {};
(function(menu){

    /**
     * @private
     */
    function _initMenu(){

        $(".sidebar-menu").find("a").each(function(){
            var menu_href = $(this).attr("href");
            var activeMenuHref = $("input[name='menu_active']").val();
            if (menu_href === activeMenuHref) {
                $(this).parents("li").addClass("active");
            }
        });
    }

//====================================================================================================================
    menu.initMenu = _initMenu;

})(AdminMenu);



AdminMenu.initMenu();