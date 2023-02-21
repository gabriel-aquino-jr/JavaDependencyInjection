package com.dependencyinjection.constructor;

import com.engines.Engine;

public class CarDIConstructor {
    private final Engine engine;

    public CarDIConstructor(Engine engine) {
        System.out.println("Building a Car with Dependency Constructor, so it is already built with an engine on it!");
        this.engine = engine;
    }

    public void start() {
        System.out.println("I'm about to start a " + engine.toString());
        engine.start();
    }

}
