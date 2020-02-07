package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Jedis jedis = new Jedis("127.0.0.1",6379);
	@Test
	public void contextLoads() {
		jedis.set("redis","redis");
		System.out.println(jedis.get("redis"));
	}

}
