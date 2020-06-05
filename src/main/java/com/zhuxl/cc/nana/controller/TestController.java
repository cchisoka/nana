package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Title:        TestController.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
@Api(tags = "TestController", description = "测试控制类")
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @ApiOperation(value = "sayHi")
    @ResponseBody
    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi() {
        return "hello";
    }

    @RequestMapping(value = "/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("helloMsg", "hello freemarker");
        return "index";
    }


    @ApiOperation(value = "根据id查询账号名")
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public CommonResult queryUserName(@PathVariable(name = "id") Long id) {

        return CommonResult.success(testService.selectNameById(id));
    }
}
