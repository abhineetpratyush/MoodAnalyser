package com.capgemini.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		if(message.contains("I am in Sad Mood"))
			return "SAD";
		else
			return "HAPPY"; 
	}
	public static void main( String[] args ) {
		
	}
}
