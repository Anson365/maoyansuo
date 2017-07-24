package com.maoyansuo.util;

import com.maoyansuo.domain.dto.MYSException;
import com.maoyansuo.domain.dto.Response;

/**
 * Created by daihua on 2017/7/23.
 */
public class ResponseUtil {
    public static<T> Response<T> getSuccessResponse(T t){
        Response response = new Response(1000,t,"success",true);
        return response;
    }

    public static<T> Response<T> getFailureResponse(MYSException e,T t){
        Response response = new Response(e.getCode(),t,e.getMessage(),false);
        return response;
    }

    public static <T> Response<T> getFailureResponse(MYSException e){
        Response response = new Response(e.getCode(),null,e.getMessage(),false);
        return response;
    }
}
