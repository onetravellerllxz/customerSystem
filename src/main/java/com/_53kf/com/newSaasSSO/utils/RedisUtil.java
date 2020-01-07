package com._53kf.com.newSaasSSO.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 /*
 * @author 当时明月在
 * @create 2020/1/7
 * @since 1.0.0
 */
@Component
@Slf4j
public class RedisUtil {
    @Autowired
    @Resource(name = "myRedisTemplate")
    private RedisTemplate redisTemplate;

}
