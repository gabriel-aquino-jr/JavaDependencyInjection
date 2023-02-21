package com.nodependency;

import com.engines.Engine;

public class Car {
    private Engine engine = new Engine();

    public Car() {
        System.out.println("Building a com.nodependency.Car");
    }

    public void start() {
        System.out.println("I'm about to start a " + engine.toString());
        engine.start();
    }

}
