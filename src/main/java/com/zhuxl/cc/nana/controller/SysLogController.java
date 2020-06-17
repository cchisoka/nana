package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonPage;
import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.model.dto.SysLogDTO;
import com.zhuxl.cc.nana.model.query.SysLogSearch;
import com.zhuxl.cc.nana.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/17
 */
@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/list")
    public String list() {
        return "log/list";
    }

    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<SysLogDTO>> listSysLog(SysLogSearch search,
                                                          @RequestParam(name = "offset", defaultValue = "0") int offset,
                                                          @RequestParam(name = "limit", defaultValue = "10") int limit) {
        List<SysLogDTO> list = sysLogService.selectSysLogByCon(search, offset, limit);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
