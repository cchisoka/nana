package com.zhuxl.cc.nana.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Title:        TestMapper.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
public interface TestMapper {

    String selectUserNameById(Long id);
}
