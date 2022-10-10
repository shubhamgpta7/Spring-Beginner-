package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context 
				= new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from the container
				Coach theCoach = context.getBean("myCoach",Coach.class);
				
				System.out.println(theCoach.getDailyWorkout());
				//close the context
				context.close();


	}

}
