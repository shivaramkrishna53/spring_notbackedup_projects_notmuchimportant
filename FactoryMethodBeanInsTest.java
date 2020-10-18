package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import oracle.ons.Connection;



public class FactoryMethodBeanInsTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		Class c1=factory.getBean("c1",Class.class);
		System.out.println("obj class name"+c1.getClass()+" obj data"+c1.toString());
		Calendar cal=factory.getBean("cal1",Calendar.class);
		System.out.println("obj class name"+cal.getClass()+"obj data"+cal.toString());
		//Connection con=factory.getBean("con",Connection.class);
		//System.out.println("obj class name"+con.getClass()+"obj data:"+con.toString());
		String x=factory.getBean("s2",String.class);
		System.out.println("obj class name::"+x.getClass()+"obj class data::"+x.toString());
		String y=factory.getBean("s3",String.class);
		System.out.println("obj class name::"+y.getClass()+"obj class data::"+y.toString());
		
		
		

	}

}