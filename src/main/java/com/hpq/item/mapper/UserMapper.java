package com.hpq.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hpq.item.core.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author  likuan.zhou
* @title:  UserMapper
* @description: 用户mapper
* @date 2021-09-14
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
