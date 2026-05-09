package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

//    @Test
//    void shouldCreateAnInstance() {
//        assertInstanceOf(Bag.class, new Bag(12));
//    }
//
//    @Test
//    void shouldAddABall() {
//        Bag bag = new Bag(12);
//        assertTrue(bag.addBall(new Ball(BallColor.GREEN)));
//    }
//
//    @Test
//    void shouldFailToInsertAnyMoreColor() {
//        Bag bag = new Bag(1);
//        bag.addBall(new Ball(BallColor.BLUE));
//        assertFalse(bag.addBall(new Ball(BallColor.RED)));
//    }
//
//    @Test
//    void shouldReturnFalseForMoreThreeGreen() {
//        Bag bag = new Bag(12);
//        bag.addBall(new Ball(BallColor.GREEN));
//        bag.addBall(new Ball(BallColor.GREEN));
//        bag.addBall(new Ball(BallColor.GREEN));
//        assertFalse(bag.addBall(new Ball(BallColor.GREEN)));
//    }
//
//    @Test
//    void shouldReturnFalseForMore() {
//        Bag bag = new Bag(12);
//        assertTrue(bag.addBall(new Ball(BallColor.GREEN)));
//    }
//
//    @Test
//    void shouldNotBeAddRedDoubleTheGreen() {
//        Bag bag = new Bag(12);
//        bag.addBall(new Ball(BallColor.GREEN));
//        bag.addBall(new Ball(BallColor.RED));
//        bag.addBall(new Ball(BallColor.RED));
//        assertFalse(bag.addBall(new Ball(BallColor.RED)));
//    }
//
//    @Test
//    void shouldAddYellowLessTheProportion() {
//        Bag bag = new Bag(12);
//        bag.addBall(new Ball(BallColor.GREEN));
//        bag.addBall(new Ball(BallColor.RED));
//        bag.addBall(new Ball(BallColor.RED));
//        assertTrue(bag.addBall(new Ball(BallColor.YELLOW)));
//    }
//
//    @Test
//    void shouldNotAddYellowMoreTheProportion() {
//        Bag bag = new Bag(12);
//        bag.addBall(new Ball(BallColor.GREEN));
//        bag.addBall(new Ball(BallColor.RED));
//        bag.addBall(new Ball(BallColor.YELLOW));
//        assertFalse(bag.addBall(new Ball(BallColor.YELLOW)));
//    }
//
//    @Test
//    void shouldAddAsManyBlueBalls() {
//        Bag bag = new Bag(12);
//
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.GREEN)));
//        assertTrue(bag.addBall(new Ball(BallColor.RED)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//        assertTrue(bag.addBall(new Ball(BallColor.BLUE)));
//    }

    @Test
    void checkSummary() {

        ArrayList<BagRules> Rules = new ArrayList<>();
        Rules.add(BagRules.MAX_3_GREENS);
        Rules.add(BagRules.RED_PROPORTION);
        Rules.add(BagRules.YELLOW_PROPORTION);
        Rules.add(BagRules.UNLIMITED_BLUE);

        Bag bag = new Bag(12, Rules);
        bag.addBall(new Ball(BallColor.BLUE));
        bag.addBall(new Ball(BallColor.BLUE));
        bag.addBall(new Ball(BallColor.BLUE));
        bag.addBall(new Ball(BallColor.BLUE));
        bag.addBall(new Ball(BallColor.GREEN));
        bag.addBall(new Ball(BallColor.RED));

        String summary = bag.generateSummary();
        String expected = """
                Blue    : 4
                Green   : 1
                Red     : 1
                Yellow  : 0
                
                Total   : 6""";

        assertEquals(expected, summary);
    }
}

