package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
