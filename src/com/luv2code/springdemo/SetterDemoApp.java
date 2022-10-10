package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call the bean methods
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getFortune());
		
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		
		//close the bean context
		context.close();

	}

}
