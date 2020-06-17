package com.zhuxl.cc.nana.service;

import com.zhuxl.cc.nana.model.domain.SysLog;
import com.zhuxl.cc.nana.model.dto.SysLogDTO;
import com.zhuxl.cc.nana.model.query.SysLogSearch;

import java.util.List;

public interface SysLogService {

    void writeSysLog(SysLog sysLog);

    List<SysLogDTO> selectSysLogByCon(SysLogSearch search, int offset, int limit);
}
