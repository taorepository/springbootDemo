package com.example.demo.config;

//import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class PageableConfig {

	/**
	 * 注册MyBatis分页插件PageHelper
	 */
//	@Bean
//	public PageHelper pageHelper() {
//		PageHelper pageHelper = new PageHelper();
//		Properties p = new Properties();
//		p.setProperty("offsetAsPageNum", "true");
//		p.setProperty("rowBoundsWithCount", "true");
//		p.setProperty("reasonable", "true");
//		p.setProperty("spring.ptl.page.enabled", "true");
//		pageHelper.setProperties(p);
//		return pageHelper;
//	}
}
