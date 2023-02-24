package com.one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behavior{


    @Override
    public void toMove() {
        System.out.println("Esta movendo agressivamente...");
    }
}
