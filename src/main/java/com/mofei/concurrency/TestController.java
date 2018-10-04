package com.mofei.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @RequestMapping(method = RequestMethod.GET,value = "/test")
    @ResponseBody
    public String test(){
        log.info("xyz {}", "sd");
        return "String";
    }
}
