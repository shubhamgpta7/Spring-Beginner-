package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAppDemo {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context 
					= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from the container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if both are referencing to the same memory
		boolean result = (theCoach==alphaCoach);
		
		//printing the results
		System.out.println("\nPointing the same object => "+result);
		
		System.out.println("\nMemory location of theCoach => "+theCoach);
		
		System.out.println("\nMemory location of alphaCoach => "+alphaCoach);
		
		//close the context
		context.close();
	}

}
