package com.gang.spring.beanmanager.demo.controller.other;

import com.gang.spring.beanmanager.demo.condition.SelfConfition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Classname APIFilter
 * @Description TODO
 * @Date 2020/9/29 15:45
 * @Created by zengzg
 */
@Component
@Conditional(SelfConfition.class)
//@Order(0)
public class APIFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("------> this is in other apiFilter <-------");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
