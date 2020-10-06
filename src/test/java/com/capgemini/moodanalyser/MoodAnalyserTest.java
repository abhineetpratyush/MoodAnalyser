package com.capgemini.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
    	MoodAnalyser moodObj = new MoodAnalyser();
    	String mood = moodObj.analyseMood("I am in Sad Mood");
    	Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
    	MoodAnalyser moodObj = new MoodAnalyser();
    	String mood = moodObj.analyseMood("I am in Any Mood");
    	Assert.assertEquals("HAPPY", mood); 
    }
}

