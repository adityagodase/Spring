package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/durgasoft/resources/applicationContext.xml");
		WishBean bean = (WishBean) context.getBean("wishBean");

		System.out.println(bean.wishUser());

	}

}
