package com.mybatis.dao;

import com.mybatis.model.User;

import java.util.List;

/**
 * Created by jibingbing on 2018/2/24.
 */
public interface UserMapper {
    /**
    * @Description: 查询所有用户
    * @Param: []
    * @Return: java.util.List<com.mybatis.model.User>
    * @Author: jibingbing
    * @Date: 2018/2/25
    */
    List<User> selectAll();
    
    /**
     * @Description: 根据Id查询用户
     * @Param: [id]
     * @Return: com.mybatis.model.User
     * @Author: jibingbing
     * @Date: 2018/2/24
     */
    User selectById(int id);

    /**
    * @Description: 添加用户
    * @Param: [user]
    * @Return: int
    * @Author: jibingbing
    * @Date: 2018/2/24
    */
    int add(User user);

    /**
    * @Description: 修改用户
    * @Param: [user]
    * @Return: int
    * @Author: jibingbing
    * @Date: 2018/2/25
    */
    int update(User user);

    /**
    * @Description: 根据id删除用户
    * @Param: [id]
    * @Return: int
    * @Author: jibingbing
    * @Date: 2018/2/25
    */
    int delete(int id);
    
    /**
    * @Description: 根据Id查询带地址的用户
    * @Param: [id]
    * @Return: com.mybatis.model.User
    * @Author: jibingbing
    * @Date: 2018/2/25
    */
    User selectUserWithAddressById (int id);
    
}
