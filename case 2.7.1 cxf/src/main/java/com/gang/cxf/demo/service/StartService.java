package com.gang.cxf.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class StartService implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SearchEditService searchEditService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("------> this is run <-------");
        searchEditService.exchange();
    }
}
