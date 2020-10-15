package com.gang.ldap.spring.demo.controller;

import com.gang.ldap.spring.demo.logic.LdapAuthLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LdapController
 * @Description TODO
 * @Date 2020/10/15 18:08
 * @Created by zengzg
 */
@RestController
@RequestMapping("/test")
public class LdapController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LdapAuthLogic ldapAuthLogic;

    @GetMapping
    public void test() {
        logger.info("------> test <-------");
        ldapAuthLogic.doLdapAuthSpring();
    }

}
