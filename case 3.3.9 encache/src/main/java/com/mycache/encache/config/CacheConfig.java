package com.mycache.encache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 10169
 * @Description TODO
 * @Date 2019/3/8 23:14
 * @Version 1.0
 **/
@Configuration
public class CacheConfig {

//    @Bean
//    public EhCacheCacheManager cacheManager(){
//        return  new EhCacheCacheManager();
//    }
//
//    @Bean
//    public EhCacheManagerFactoryBean ehcache(){
//        return  new EhCacheManagerFactoryBean();
//    }
}
