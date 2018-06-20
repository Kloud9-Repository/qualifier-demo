package com.k9.qualifier.demo.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.k9.qualifier.demo.service.MyService;

@Component
@PropertySource(value = { "classpath:application.properties" })
public class TestController {


	// @Qualifier("service2Impl")
	@Resource(name = "${beanName}")
	private MyService service;

	public String getResponse() {
		return service.testService();
	}

}
