package com.hpq.item.core.domain.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* @author  likuan.zhou
* @title:  PageParam
* @description: 分页参数
* @date 2021-09-14
*/
@Data
@ApiModel(value="分页参数", description="分页参数")
public class PageParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "页码")
    private Integer pageNo;

    @ApiModelProperty(value = "每页展示条数")
    private Integer pageSize;

    public Integer getPageNo() {
        if (pageNo==null||pageNo<=0) {
             pageNo = 1;
        }
        return pageNo;
    }


    public Integer getPageSize() {
        if (pageSize==null||pageSize<=0) {
            pageSize = 10;
        }
        return pageSize;
    }

}
