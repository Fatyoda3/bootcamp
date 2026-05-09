package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

    @Test
    void shouldCreateAnInstance() {
        assertInstanceOf(Bag.class, new Bag(12));
    }


    @Test
    void shouldAddABall() {
        Bag bag = new Bag(12);
        assertTrue(bag.addBall(new Ball(Color.GREEN)));
    }

    @Test
    void shouldFailToInsertAnyMoreColor() {
        Bag bag = new Bag(1);
        bag.addBall(new Ball(Color.BLUE));
        assertFalse(bag.addBall(new Ball(Color.RED)));
    }

    @Test
    void shouldReturnFalseForMoreThreeGreen() {
        Bag bag = new Bag(12);
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.GREEN));
        assertFalse(bag.addBall(new Ball(Color.GREEN)));
    }

    @Test
    void shouldReturnFalseForMore() {
        Bag bag = new Bag(12);
        assertTrue(bag.addBall(new Ball(Color.GREEN)));
    }

    @Test
    void shouldNotBeAddRedDoubleTheGreen() {
        Bag bag = new Bag(12);
        bag.addBall(new Ball(Color.GREEN));
        bag.addBall(new Ball(Color.RED));
        bag.addBall(new Ball(Color.RED));
        assertFalse(bag.addBall(new Ball(Color.RED)));
    }
}

