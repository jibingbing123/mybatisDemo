package com.mybatis.daoImpl;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.User;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/02/24
 **/
public class UserMapperImpl implements UserMapper {
    private SqlSession session = SqlSessionUtil.getSqlSession();
    private UserMapper userMapper = session.getMapper(UserMapper.class);

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public User selectById(int id) {
        User user = null;
        try {
            user = userMapper.selectById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public int add(User user) {
        int result = 0;
        try {
            result = userMapper.add(user);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public int update(User user) {
        int result = 0;
        try {
            result = userMapper.update(user);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public int delete(int id) {
        int result = 0;
        try {
            result = userMapper.delete(id);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public User selectUserWithAddressById(int id) {
        User user = userMapper.selectUserWithAddressById(id);
        return user;
    }
}
