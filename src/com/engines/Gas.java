package com.engines;

public class Gas extends Engine{

    public Gas() {
        super();
        System.out.println("Actually I am a Gas Engine!");
    }

    @Override
    public String toString() {
        return "Gas Engine";
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Actually I started a Gas Engine!");
    }
}
