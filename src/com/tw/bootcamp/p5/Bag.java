package com.tw.bootcamp.p5;

public class Bag {

    private final int totalCapacity;

    private int r = 0;
    private int g = 0;
    private int b = 0;
    private int y = 0;

    public Bag(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public boolean addBall(Ball ball) {
        if (this.totalCapacity <= this.totalBalls() || isPlacementNotPossible(ball)) {
            return false;
        }

        incrementTheBallCount(ball);

        return true;
    }

    private boolean isPlacementNotPossible(Ball ball) {
        if (ball.isSameColor(BallColor.GREEN)) {
            return this.g + 1 > 3;
        }

        if (ball.isSameColor(BallColor.RED)) {
            return this.r >= (2 * this.g);
        }

        if (ball.isSameColor(BallColor.YELLOW)) {
            return (this.y + 1) >= (0.4 * (this.totalBalls() + 1));
        }

        return false;
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
