package com.capgemini.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in Sad Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("SAD", mood);
    }
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in Any Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("HAPPY", mood); 
    }
    
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
    	MoodAnalyser moodObj = new MoodAnalyser(null);
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("HAPPY", mood); 
    }
}

