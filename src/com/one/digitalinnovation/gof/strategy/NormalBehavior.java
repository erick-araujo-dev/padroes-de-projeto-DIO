package com.one.digitalinnovation.gof.strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void toMove() {
        System.out.println("Esta movendo normalmente...");
    }
}
