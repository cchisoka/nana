// 手机号码验证
jQuery.validator.addMethod("isMobile", function(value, element) {
    var phoneNumber = /^1(3|4|5|6|7|8|9)\d{9}$/;
    return this.optional(element) || (phoneNumber.test(value));
}, "手机号码格式不正确");

//网址验证
jQuery.validator.addMethod("isURL", function(value, element) {
    var flag = false;
    if (value) {
        flag = (value.indexOf(".") != -1) && (value.length >= 3)
    }
    return this.optional(element) || flag;
}, "官网格式不正确");

//联系电话
jQuery.validator.addMethod("linkNumber", function(value, element) {
    var flag = false;
    var linkNumber = /^[0-9\\(\\)转\\-]{7,}$/
    if (value) {
        value = value.trim();
        flag = linkNumber.test(value);
    }
    return this.optional(element) || flag;
}, "联系电话格式不正确，请填写手机号码或固定电话号码");


//名称验证
jQuery.validator.addMethod("name", function(value, element) {
    var flag = false;
    if (value) {
        value = value.trim();
        flag = !!value;
    }
    return this.optional(element) || flag;
}, "请输入正确的名称");