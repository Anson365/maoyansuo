package com.maoyansuo.domain.dto;

import lombok.Data;

/**
 * Created by daihua on 2017/7/23.
 */
@Data
public class MYSException extends RuntimeException {

    private Integer code;
    private String message;

    public MYSException(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public MYSException(Exception e){
        super(e);
        this.code = 1001;
        this.message = e.getMessage();
    }
    public MYSException(String message){
        this.code = 1001;
        this.message = message;
    }
}
