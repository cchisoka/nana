package com.zhuxl.cc.nana.service.impl;

import com.zhuxl.cc.nana.dao.TestMapper;
import com.zhuxl.cc.nana.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title:        TestServiceImpl.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String selectUserNameById(Long id) {
        return testMapper.selectUserNameById(id);
    }
}
