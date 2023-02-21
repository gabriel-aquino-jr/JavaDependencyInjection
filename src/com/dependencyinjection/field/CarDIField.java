package com.dependencyinjection.field;

import com.engines.Engine;

public class CarDIField {
    private Engine engine;

    public CarDIField() {
        System.out.println("Building a Car with Dependency Field, so no engine yet!");
    }

    public void setEngine(Engine engine) {
        System.out.println("Now I'm installing the engine " + engine.toString() + " on the car!");
        this.engine = engine;
    }

    public void start() {
        System.out.println("I'm about to start a " + engine.toString());
        engine.start();
    }

}
