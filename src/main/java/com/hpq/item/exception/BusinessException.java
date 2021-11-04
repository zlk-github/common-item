package com.hpq.item.exception;

import lombok.Data;

/**
 * 自定义异常
 *
 * @author likuan.zhou
 * @date 2021/11/3/003 14:17
 */
@Data
public class BusinessException extends RuntimeException{
    /**异常code*/
    private String code;
    /**异常描述*/
    private String msg;

    public BusinessException(String msg) {
        this(msg,null);
    }

    public BusinessException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }
}
