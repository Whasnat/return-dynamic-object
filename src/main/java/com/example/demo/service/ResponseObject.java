package com.example.demo.service;

import java.util.Objects;

public class ResponseObject {

    private String message;
    private String status;
    private  Object obj;

    public ResponseObject(String message, String status, Object obj) {
        this.message = message;
        this.status = status;
        this.obj = obj;
    }


    public ResponseObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseObject that = (ResponseObject) o;
        return Objects.equals(message, that.message) && Objects.equals(status, that.status) && Objects.equals(obj, that.obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, status, obj);
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", obj=" + obj +
                '}';
    }
}
