package com.tw.bootcamp.p5;

@FunctionalInterface
public interface Rule {
    boolean applyRule(Ball ball , int ballCount);

}
