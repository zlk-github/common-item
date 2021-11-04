package com.hpq.item.handler;

import com.hpq.item.core.response.Response;
import com.hpq.item.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕获
 * @author
 * @date 2021/11/3/003 13:33
 */

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Response<?> errorHandler(Exception ex) {
        log.error("系统异常，",ex);
        return Response.newFailResponse();
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public Response<?> myErrorHandler(BusinessException ex) {
        log.error("业务异常异常,异常code:{},异常描述:{}",ex.getCode(),ex.getMsg(),ex);
        return Response.newFailResponse(ex.getCode());
    }


}
