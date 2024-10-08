package com.durgasot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/durgasoft/resources/applicationContext.xml");
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println(bean.sayHello());

	}

}
