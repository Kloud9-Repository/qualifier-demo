package com.k9.qualifier.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.k9.qualifier.demo.controller.TestController;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/k9/qualifier/demo/config/application-context.xml");

		TestController controller = context.getBean(TestController.class);
		System.out.println(controller.getResponse());
	}
}
