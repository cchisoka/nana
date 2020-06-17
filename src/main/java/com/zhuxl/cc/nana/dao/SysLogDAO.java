package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysLog;
import com.zhuxl.cc.nana.model.dto.SysLogDTO;
import com.zhuxl.cc.nana.model.query.SysLogSearch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysLogDAO {
    int deleteByPrimaryKey(Long logid);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long logid);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

    List<SysLogDTO> selectSysLogByCon(SysLogSearch search);
}
