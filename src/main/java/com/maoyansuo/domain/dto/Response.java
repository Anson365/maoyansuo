package com.maoyansuo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by daihua on 2017/7/23.
 */
@Data
@AllArgsConstructor
public class Response<T> {
    private Integer code;
    private T data;
    private String message;
    private boolean success;
}
