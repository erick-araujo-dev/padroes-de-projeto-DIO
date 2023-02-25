package com.one.digitalinnovation.gof;

import com.one.digitalinnovation.gof.facade.Facade;
import com.one.digitalinnovation.gof.singleton.SingletonEager;
import com.one.digitalinnovation.gof.singleton.SingletonLazy;
import com.one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import com.one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println();
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.toMove();
        robot.toMove();

        robot.setBehavior(aggressive);
        robot.toMove();
        robot.toMove();

        robot.setBehavior(defensive);
        robot.toMove();
        robot.toMove();

        //facade
        System.out.println();

        Facade facade = new Facade();
        facade.MigrateClient("Erick", "18159999");
    }


}
