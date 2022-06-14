package com.cg.springioc;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
	public static void main(String[] args)
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		  Sim s=(Sim)a.getBean("sim2");
		 s.calling();
	}

}
