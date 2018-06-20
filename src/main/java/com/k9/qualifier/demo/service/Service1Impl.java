package com.k9.qualifier.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Service1Impl implements MyService {

	@Override
	public String testService() {
		return "Response from Service1Impl ";
	}

}
