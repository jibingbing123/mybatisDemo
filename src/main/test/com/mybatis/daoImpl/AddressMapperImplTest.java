package com.mybatis.daoImpl;

import com.mybatis.dao.AddressMapper;
import com.mybatis.model.Address;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jibingbing on 2018/2/25.
 */
public class AddressMapperImplTest {
    Logger logger = LoggerFactory.getLogger(AddressMapperImplTest.class);

    @Test
    public void selectById() throws Exception {
        AddressMapper addressMapper = new AddressMapperImpl();
        Address address = addressMapper.selectById(2);
        logger.info("根据id查询地址为 {}",address);
    }
}