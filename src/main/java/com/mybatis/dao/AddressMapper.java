package com.mybatis.dao;

import com.mybatis.model.Address;

/**
 * Created by jibingbing on 2018/2/24.
 */
public interface AddressMapper {

    
    /**
     * @Description: 根据Id查询地址
     * @Param: [id]
     * @Return: com.mybatis.model.User
     * @Author: jibingbing
     * @Date: 2018/2/24
     */
    Address selectById(int id);
    
}
