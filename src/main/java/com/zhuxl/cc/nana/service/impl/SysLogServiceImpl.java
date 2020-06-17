package com.zhuxl.cc.nana.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhuxl.cc.nana.dao.SysLogDAO;
import com.zhuxl.cc.nana.model.domain.SysLog;
import com.zhuxl.cc.nana.model.dto.SysLogDTO;
import com.zhuxl.cc.nana.model.query.SysLogSearch;
import com.zhuxl.cc.nana.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author: zhuxl
 * @Date: 2020/6/17
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogDAO sysLogDAO;

    @Override
    public void writeSysLog(SysLog sysLog) {
        sysLogDAO.insertSelective(sysLog);
    }

    @Override
    public List<SysLogDTO> selectSysLogByCon(SysLogSearch search, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        return sysLogDAO.selectSysLogByCon(search);
    }
}
