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
        if (this.totalCapacity <= this.totalBalls() || CanPlaceBall(ball)) {
            return false;
        }
        incrementTheBallCount(ball);

        return true;
    }

    private boolean CanPlaceBall(Ball ball) {
        if(ball.isSameColor(Color.GREEN)){
            return !( this.g < 3);
        }
        if(ball.isSameColor(Color.RED)){
            return this.r <= (2 * this.g);
        }
        return false;
    }

    private void incrementTheBallCount(Ball ball) {
        if(ball.isSameColor(Color.RED)) {
            this.r += 1;
        }
        if(ball.isSameColor(Color.BLUE)) {
            this.b += 1;
        }
        if(ball.isSameColor(Color.GREEN)) {
            this.g += 1;
        }
        if(ball.isSameColor(Color.YELLOW)) {
            this.y += 1;
        }
    }

    private int totalBalls() {
        return this.r + this.g + this.b + this.y;
    }

}
