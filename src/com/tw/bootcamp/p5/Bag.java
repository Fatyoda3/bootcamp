package com.tw.bootcamp.p5;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {

    private final int totalCapacity;
    private ArrayList<BagRules> rules = null;

    private int r = 0;
    private int g = 0;
    private int b = 0;
    private int y = 0;

    public Bag(int totalCapacity, ArrayList<BagRules> rules) {
        this.totalCapacity = totalCapacity;
        this.rules = rules;
    }

    public boolean addBall(Ball ball) {
        if (this.totalCapacity <= this.totalBalls() || isPlacementNotPossible(ball)) {
            return false;
        }

        incrementTheBallCount(ball);

        return true;
    }


    private boolean isPlacementNotPossible(Ball ball) {
//        System.out.println(this.rules.stream().anyMatch(rule-> rule.applyRule(createDataSet())));
       if ( ball.isSameColor(BallColor.GREEN) || ball.isSameColor(BallColor.RED) ||ball.isSameColor(BallColor.YELLOW))
        return this.rules.stream().anyMatch(rule-> rule.applyRule(createDataSet()));
       return false;
//        if (ball.isSameColor(BallColor.GREEN)) {
//            return BagRules.MAX_3_GREENS.applyRule(createDataSet());
//        }
//
//        if (ball.isSameColor(BallColor.RED)) {
//            return BagRules.RED_PROPORTION.applyRule(createDataSet());
//        }
//
//        if (ball.isSameColor(BallColor.YELLOW)) {
//            return BagRules.YELLOW_PROPORTION.applyRule(createDataSet());
//        }
//
//        return BagRules.UNLIMITED_BLUE.applyRule(createDataSet());
    }

    private HashMap<String, Integer> createDataSet() {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("g", this.g);
        data.put("b", this.b);
        data.put("y", this.y);
        data.put("r", this.r);
        data.put("t", this.totalBalls());
        return data;
    }

    private void incrementTheBallCount(Ball ball) {
        if (ball.isSameColor(BallColor.RED)) {
            this.r += 1;
        }
        if (ball.isSameColor(BallColor.BLUE)) {
            this.b += 1;
        }
        if (ball.isSameColor(BallColor.GREEN)) {
            this.g += 1;
        }
        if (ball.isSameColor(BallColor.YELLOW)) {
            this.y += 1;
        }
    }

    private int totalBalls() {
        return this.r + this.g + this.b + this.y;
    }

    public String generateSummary() {
        StringBuilder summary = new StringBuilder();

        summary.append("Blue    : %d\n".formatted(this.b));
        summary.append("Green   : %d\n".formatted(this.g));
        summary.append("Red     : %d\n".formatted(this.r));
        summary.append("Yellow  : %d\n".formatted(this.y));
        summary.append("\nTotal   : %d".formatted(this.totalBalls()));

        return summary.toString();

    }
}
