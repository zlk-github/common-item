package com.hpq.item.core.enums;

/**
 * 异常枚举定义
 * @author likuan.zhou
 * @date 2021/11/3/003 13:53
 */
public enum ExceptionEnum {

    SYSTEM_FAIL_CODE("1", "系统开小差中，请稍后再试..."),
    OK_CODE("0", "成功");

    private final String code;
    private final String msg;

    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsg(String code) {
        for (ExceptionEnum ele : values()) {
            if(ele.getCode().equals(code)) {
                return ele.getMsg();
            }
        }
        return "";
    }

}
