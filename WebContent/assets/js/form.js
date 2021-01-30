/**
 * Sea.js 2.1.1 | seajs.org/LICENSE.md
 */
var form = $('#submitform');
    $(document).ready(function () {
        form.bootstrapValidator({
            message: '输入值不合法',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	username: {
                    message: '*用户名不合法',
                    validators: {
                        notEmpty: {
                            message: '*用户名不能为空'
                        },
                        regexp: {
                            regexp: "^([0-9]{14})?$",
                            message: '*学号格式错误'
                        }
                    }
                }
                ,password: {
                        validators: {
                            notEmpty: {
                            message: '*新密码不能为空'
                            },
                            stringLength: {
                                min: 6,
                                max: 6,
                                message: '*密码格式错误'
                            },
                            regexp: {
                                regexp: /^[a-zA-Z\d]+$/,
                                message: '*密码只能由字母数字或字母组成 '
                            }
                        }
                }
                ,checkPwd: {
                    validators: {
                        notEmpty: {
                        message: '*确认密码不能为空'
                        },
                        identical: {
                            field: 'password',
                            message: '*两次输入密码不一致'
                        }
                    }
                } 
                , email: {
                    validators: {
                        notEmpty: {
                            message: '*email不能为空'
                        },
                        emailAddress: {
                            message: '*请输入正确的邮件地址如：123@qq.com'
                        }
                    }
                }, phone: {
                    validators: {
                        notEmpty: {
                            message: '*手机号不能为空'
                        },
                        regexp: {
                            regexp: "^([0-9]{11})?$",
                            message: '*手机号码格式错误'
                        }
                    }
                }
            }
        });
    });