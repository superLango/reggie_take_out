package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Lango
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
