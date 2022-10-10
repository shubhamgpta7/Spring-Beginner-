package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//define literal fields
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		System.out.println("Set Email Address method");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println("Set Team method");
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//Creating a no-args constructor
	public CricketCoach() {
		System.out.println("Inside a constructor of CricketCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Inside CricketCoach getDailyWorkout() ";
	}

	//setting the setter method for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setetr Method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
