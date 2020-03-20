package com.mall.common.service.domain;

import com.mall.common.service.error.Error;
import com.mall.common.service.error.impl.CommonError;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zheng haijain
 * @createTime 2020-03-18 14:49
 * @description
 */
public final class ServiceResponse<T> implements Serializable {

    private int code;

    private String desc;

    private T data;

    private Map<String, Object> extension;

    private ServiceResponse() {
    }

    public ServiceResponse(Error error) {
        this.code = error.getCode();
        this.desc = error.getDesc();
    }

    public ServiceResponse(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public ServiceResponse(Error error, T data) {
        this.code = error.getCode();
        this.desc = error.getDesc();
        this.data = data;
    }

    public boolean isSuccess() {
        return this.code == CommonError.SUCCESS.getCode();
    }

    public String toString() {
        return "{\"code\":" + this.code + ", \"desc\":'" + this.desc + '\'' + ", \"data\":" + this.data + '}';
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<String, Object> getExtension() {
        return this.extension;
    }

    public void setExtension(Map<String, Object> extension) {
        this.extension = extension;
    }

}
