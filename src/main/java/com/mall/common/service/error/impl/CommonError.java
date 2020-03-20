package com.mall.common.service.error.impl;

import com.mall.common.service.error.Error;

/**
 * @author zheng haijain
 * @createTime 2020-03-18 14:42
 * @description
 */
public enum CommonError implements Error {

    SUCCESS(10000, "成功"),

    NEED_LOGIN(11990001, "请登录"),

    INVALID_PARAMTER(11990002, "缺少必要参数"),

    INVALID_COMMON_PARAMTER(11990003, "缺少公共参数必要参数"),

    UNKNOW_ERROR(11999999, "未捕获的异常"),

    SYSTEM_BUSY(99999999, "System busy.");

    private Integer code;
    private String desc;

    CommonError(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public static CommonError valueOfCode(int code){
        CommonError[] errors = values();

        for (CommonError error : errors) {
            if (error.getCode().equals(code)){
                return error;
            }
        }

        return null;
    }

}
