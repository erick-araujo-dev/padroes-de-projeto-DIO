package com.one.digitalinnovation.gof.strategy;
public class DefensiveBehavior implements Behavior{
    @Override
    public void toMove() {
        System.out.println("Esta movendo defensivamente...");
    }
}
