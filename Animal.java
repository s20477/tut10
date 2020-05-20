package com.company;

public abstract class Animal implements Moveable {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getType();

    abstract String getName();

    @Override
    public String start() {
        return "Cat starts!";
    }

    @Override
    public String stop() {
        return "Cat stops!";
    }
}

