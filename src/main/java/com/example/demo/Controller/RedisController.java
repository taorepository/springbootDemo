package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020\2\7 0007.
 */
@RestController
@RequestMapping("/demo")
public class RedisController {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @RequestMapping(value = "/hello")
    public Object hello(){
        redisTemplate.opsForValue().set("www","1111111");
        return redisTemplate.opsForValue().get("www");
    }
}
