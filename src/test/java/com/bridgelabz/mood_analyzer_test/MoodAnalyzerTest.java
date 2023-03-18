package com.bridgelabz.mood_analyzer_test;

import com.bridgelabz.mood_analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
