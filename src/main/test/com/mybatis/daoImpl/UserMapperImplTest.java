package com.mybatis.daoImpl;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by jibingbing on 2018/2/24.
 */
public class UserMapperImplTest {
//    public final Logger logger = Logger.getLogger(UserMapperImplTest.class);
    Logger logger = LoggerFactory.getLogger(UserMapperImplTest.class);

    @Test
    public void selectAll () throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        List<User> users = userMapper.selectAll();
        for(User user : users){
            logger.info("查询所有用户为 {}",user.toString());
        }
    }

    @Test
    public void selectUserWithAddressById() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        User user = userMapper.selectUserWithAddressById(3);
        logger.info("根据Id查询带地址的用户 {}", user);
    }

    @Test
    public void selectById() throws Exception {

    }

    @Test
    public void add() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        User user = new User("季兵兵",24,"男");
        userMapper.add(user);
        logger.info("添加成功,添加的用户为 {}",user.toString());
    }

    @Test
    public void update() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        User user = new User(2,"刘影",23,"女");
        int result = userMapper.update(user);
        if(result > 0){
            logger.info("更新用户成功,更新后用户为 {}",user.toString());
        }
    }

    @Test
    public void delete() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        int result = userMapper.delete(4);
        if (result > 0) {
            logger.info("删除用户成功,删除的用户id为 {}", 4);
        }
    }
}