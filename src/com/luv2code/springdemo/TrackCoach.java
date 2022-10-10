package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define default constructor
	public TrackCoach() {
		
	}
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run a hard 5K";
	}

	@Override
	public String getFortune() {
		//lets call fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	private void start() {
		System.out.println("Start method");
	}

	private void khatam() {
		System.out.println("Khatam method");
	}
}








