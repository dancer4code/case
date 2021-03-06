package com.alibaba.nacos.example.spring.boot.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("discovery")
public class DiscoveryController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @NacosInjected
    private NamingService namingService;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        logger.info("------> this is in get <-------");
        return namingService.getAllInstances(serviceName);
    }

    @GetMapping("send")
    public String sendMsg(@RequestParam String serviceName) throws NacosException {
        List<Instance> instances = namingService.getAllInstances(serviceName);
        instances.forEach(item -> {
            logger.info("------> ip :{} <-------", item.getIp());
        });
        return "ok";
    }
}
