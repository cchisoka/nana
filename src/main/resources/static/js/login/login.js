var LOGIN = LOGIN || {};

(function (login) {

    function _validateForm() {
        var username = $("#login_form").find('input[name="username"]').val();
        var password = $("#login_form").find('input[name="password"]').val();
        if (!username) {
            _showErrorMsg("请输入用户名");
            return false;
        }

        if (!password) {
            _showErrorMsg("请输入密码");
            return false;
        }
        return true;
    }

    function _showErrorMsg(msg) {
        $("#error_span").text(msg)
    }

    function _clearErrorMsg() {
        $("#error_span").empty();
    }

    function _initPage() {

    }

    login.initPage = _initPage;
    login.validateForm = _validateForm;
})(LOGIN);


$(function () {

});
