package com.quan.common.bean;

import java.io.Serializable;

/**
 * @Description:
 * @Author heyq
 * @Date 2021-01-09
 **/
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int SUCCESS = 0;

    public static final int ERROR = 1;

    private int code = SUCCESS;

    private T data;

    private String msg = "success";

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(Throwable e) {
        super();
        this.code = ERROR;
        this.msg = e.toString();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
