package com.sayhi.common.bean;

import lombok.Data;

@Data
public class BaseResult<T> {

    private String code;

    private String message;

    private T data;
}
