package com.example.ph51025_asmgd2_and103.model;

public class ResponseGHN<T> {
    private int code;
    private String message;
    private T data;

    public ResponseGHN() {
    }

    public ResponseGHN(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}