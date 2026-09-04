package com.educandoweb.course.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant timestemp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(){

    }

    public StandardError(String error, String message, String path,Integer status, Instant timestemp) {
        this.error = error;
        this.message = message;
        this.path = path;
        this.status = status;
        this.timestemp = timestemp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Instant getTimestemp() {
        return timestemp;
    }

    public void setTimestemp(Instant timestemp) {
        this.timestemp = timestemp;
    }

}
