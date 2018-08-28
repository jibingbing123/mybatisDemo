package com.mybatis.daoImpl;

import com.mybatis.dao.AddressMapper;
import com.mybatis.model.Address;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/02/24
 **/
public class AddressMapperImpl implements AddressMapper {
    private SqlSession session = SqlSessionUtil.getSqlSession();
    private AddressMapper addressMapper = session.getMapper(AddressMapper.class);


    public Address selectById(int id) {
        Address address = addressMapper.selectById(id);
        return address;
    }
}

