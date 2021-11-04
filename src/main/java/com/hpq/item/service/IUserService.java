package com.hpq.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hpq.item.core.domain.param.UserParam;
import com.hpq.item.core.domain.po.User;
import com.hpq.item.core.domain.vo.UserVO;
import com.hpq.item.core.page.PageBean;

/**
* @author  likuan.zhou
* @title:  IUserService
* @description: 用户业务接口
* @date 2021-09-14
*/
public interface IUserService extends IService<User> {

    /**
     * 分页查询用户列表
     * @param userParam 查询参数
     * @return 用户列表
     */
    PageBean<UserVO> pageList(UserParam userParam);
}
