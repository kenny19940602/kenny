package com.kenny.cloud.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommonResult<T> {

    private int code;
    private String message;
    private T data;


    @JsonCreator
    public CommonResult(@JsonProperty("code") int code, @JsonProperty("message") String message, @JsonProperty("data") T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    @JsonCreator
    public CommonResult(@JsonProperty("data") T data,@JsonProperty("message") String message,@JsonProperty("code") int code) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public CommonResult(String s, int i) {
        this.message = s;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }
}
