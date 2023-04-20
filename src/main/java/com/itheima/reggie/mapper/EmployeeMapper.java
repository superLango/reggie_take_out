package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Lango
 * @version 1.0
 *
 * 数据访问层
 */
@Mapper // 编译后生成相应的接口实现类
// BaseMapper 继承常见的增删改查操作 MyBatis-Pius 提供
public interface EmployeeMapper extends BaseMapper<Employee> {
}
