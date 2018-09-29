package com.example.demoVue.dao;

/**
 * @Author: Gosin
 * @Date: 2018-09-28 8:31
 * @Action: 操作执行的反馈
 */
public class ExecuteDTO {

    private boolean success;
    private String message;
    private Object value;

    public ExecuteDTO() {

    }

    public ExecuteDTO(boolean success, String message, Object value) {
        this.success = success;
        this.message = message;
        this.value = value;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}