package cn.hipudding.springcloud.hi_client.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceFallback implements HiService {

    @Override
    public String sayHi(String name) {
        return "ERROR call sayhi";
    }
}
