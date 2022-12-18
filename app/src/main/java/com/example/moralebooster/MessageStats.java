package com.example.moralebooster;

public class MessageStats {
    private String message;
    public int score;
    public double percentage;
    public MessageStats(String message, int score, double percentage) {
        this.message = message;
        this.score = score;
        this.percentage  = percentage;
    }

    public String getMessage() {
        return message;
    }

    public int getScore() {
        return score;
    }

    public double getPercentage() {
        return percentage;
    }
}
