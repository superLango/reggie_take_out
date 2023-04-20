package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lango
 * @version 1.0
 */
public interface DishService extends IService<Dish> {

    /**
     * 新增菜品 同时插入菜品对应的口味数据，需要操作两张表： dish dish_flavor
     * @param dishDto
     */
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id 查询菜品信息和对应的口味信息
     * @param id
     * @return
     */
    public  DishDto getByIdWithFlavor(Long id);

    /**
     * 修改菜品信息和对应口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);

    /**
     * 删除 / 批量删除
     * @param ids
     */
    public void deleteWithFlavor(List<Long> ids);

}
