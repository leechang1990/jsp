package com.home.work.anno;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Excute {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Controller c =(Controller) ac.getBean("controller");
		
		Resource res= new ClassPathResource("xmlBeans.xml");
		XmlBeanFactory bf = new XmlBeanFactory(res);
		
		
	}
}
