package com.maoyansuo.controller.advice;

import com.maoyansuo.domain.dto.MYSException;
import com.maoyansuo.domain.dto.Response;
import com.maoyansuo.util.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daihua on 2017/7/23.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        MYSException mysException = new MYSException(e);
        return ResponseUtil.getFailureResponse(mysException);
    }
}
