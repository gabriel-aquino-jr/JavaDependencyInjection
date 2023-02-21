package com.nodependency;

import com.engines.Engine;
import com.engines.Gas;

public class CarGas {
    private Engine engine = new Gas();

    public CarGas() {
        System.out.println("Building a com.nodependency.Car");
    }

    public void start() {
        engine.start();
    }

}
