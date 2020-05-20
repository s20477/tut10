package com.company;

public class Cat extends Animal implements Moveable {

    public Cat(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "cat";
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String start() {
        return "Cat starts!";
    }

    @Override
    public String stop() {
        return "Cat stops!";
    }

}