package com.manish.javadev.manager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.service.HelloService;

public class SpringCxfDemo {
	public static void main(String[] args) {
		// Step1
		// Getting the Spring context object
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"springcxf-client.xml");

		// Getting the business interface object ref
		HelloService hs = (HelloService) ctx.getBean("hs");
		System.out.println("Done");

		// Call to method which is running on server as Web Service method
		String msg = hs.sendPing("Manish Srivastava");
		System.out.println(msg);
		System.out.println("Done");

	}

}
