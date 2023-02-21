package com.engines;

public class Engine {

    public Engine() {
        System.out.println("Building an engine");
    }

    @Override
    public String toString() {
        return "General Engine";
    }

    public void start() {
        System.out.println("com.engines.Engine started!");
    }
}
