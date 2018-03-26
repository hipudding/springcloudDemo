package cn.hipudding.springcloud.hi_client.controller;

import cn.hipudding.springcloud.hi_client.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name){
        return hiService.sayHi(name);
    }
}
