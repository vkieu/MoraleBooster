package com.example.moralebooster;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageStatsHolder {
    private Map<String, AtomicInteger> statistics = new HashMap<>();

    public MessageStats getMessageStats(String message) {

        int score =  this.statistics
                .computeIfAbsent(message,value -> new AtomicInteger(0))
                .addAndGet(1);

        return new MessageStats(message, score, score * 100 / MessageDB.getNumberOfTotalCalls());
    }
}
