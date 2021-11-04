package com.hpq.item.core.response;

import com.hpq.item.core.constant.ExceptionConstant;
import com.hpq.item.core.enums.ExceptionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description 重新封装返回实体
 * @Author wan
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/07/27
 **/

@Data
@ApiModel("响应体")
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "状态码(0成功，非0异常)")
    private String code;

    @ApiModelProperty(value = "错误描述")
    private String message;

    @ApiModelProperty(value = "返回对象")
    protected T data;

    public Response() {
    }

    /**
     * 只返回失败描述,系统异常
     * @param <T>
     * @return
     */
    public static <T> Response<T> newFailResponse() {
        Response<T> r = new Response<>();
        r.setCode(ExceptionEnum.SYSTEM_FAIL_CODE.getCode());
        r.setMessage(ExceptionEnum.SYSTEM_FAIL_CODE.getMsg());
        return r;
    }

    /**
     * 自定义code,返回描述。业务异常
     * @param code
     * @param <T>
     * @return
     */
    public static <T> Response<T> newFailResponse(String code) {
        Response<T> r = new Response<>();
        r.setCode(code);
        r.setMessage(ExceptionEnum.getMsg(code));
        return r;
    }

    /**
     * 自定义code,返回描述与数据。业务异常
     * @param code
     * @param t
     * @param <T>
     * @return
     */
    public static <T> Response<T> newFailResponse(String code,T t) {
        Response<T> r = new Response<>();
        r.setCode(code);
        r.setMessage(ExceptionEnum.getMsg(code));
        r.setData(t);
        return r;
    }

    /**
     * 成功,并带描述与数据
     * @param msg
     * @param t
     * @param <T>
     * @return
     */
    public static <T> Response<T> newSuccessResponse(String msg,T t) {
        Response<T> r = new Response<>();
        r.setCode(ExceptionEnum.OK_CODE.getCode());
        r.setData(t);
        r.setMessage(msg);
        return r;
    }

    /**
     * 成功，带数据，无描述
     * @param t
     * @param <T>
     * @return
     */
    public static <T> Response<T> newSuccessResponse(T t) {
        Response<T> r = new Response<>();
        r.setCode(ExceptionEnum.OK_CODE.getCode());
        r.setData(t);
        return r;
    }

}
