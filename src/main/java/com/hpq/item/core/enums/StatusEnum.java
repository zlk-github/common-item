package com.hpq.item.core.enums;

/**
 * @author hpq
 * @description: 启用、禁用状态
 * @date 2021/11/03/030 14:07
 */
public enum StatusEnum {
    /**
     * 禁用
     */
    DISABLE("0", "禁用"),
    /**
     * 启用
     */
    OK("1", "启用");

    private final String code;
    private final String info;

    StatusEnum(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
