package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.function.Function;

public enum BagRules {
    MAX_3_GREENS((set ) -> (set.get("g") + 1) > 3),
    RED_PROPORTION((set ) -> set.get("r") >= (2 * set.get("g"))),
    YELLOW_PROPORTION((set) -> (set.get("y") + 1) >= (0.4 * (set.get("t") + 1))),
    UNLIMITED_BLUE((set) -> false);


    private final Function<HashMap<String, Integer>,  Boolean> rule;

    BagRules(Function<HashMap<String, Integer> , Boolean> rule) {
        this.rule = rule;
    }


    public boolean applyRule( HashMap<String, Integer> set) {
        return (boolean) rule.apply(set);
    }



}
