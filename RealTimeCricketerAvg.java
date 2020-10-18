package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.CricketerAvgController;
import com.nt.vo.CricketerAvgVo;

public class RealTimeCricketerAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CricketerAvgController controller = null;
		//getting inputs from the front-end
	    String name,runsscored,gotout,runsgiven,wicketstaken;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the cricketer:");
		name=sc.next();
		System.out.println("Enter no. of runs scored by cricketer:");
		runsscored=sc.next();
		System.out.println("Enter no. of times cricketer got out:");
		gotout=sc.next();
		System.out.println("Enter how many runs did the cricketer given while bowling:");
		runsgiven=sc.next();
		System.out.println("Enter how many wickets did the cricketer took:");
		wicketstaken=sc.next();
		//creating vo class obj
		CricketerAvgVo vo=new CricketerAvgVo();
		vo.setName(name);
		vo.setRunsscored(runsscored);
		vo.setGotout(gotout);
		vo.setRunsgiven(runsgiven);
		vo.setWicketstaken(wicketstaken);
		factory= new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/ApplicationContext.xml");
		controller=factory.getBean("controller",CricketerAvgController.class);
		try
		{
			String result=controller.process(vo);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}