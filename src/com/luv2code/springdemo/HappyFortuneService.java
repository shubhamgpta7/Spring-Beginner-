package com.luv2code.springdemo;

//Defining Class implement Interface
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!!";
	}

}
