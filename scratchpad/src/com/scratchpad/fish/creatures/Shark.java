package com.scratchpad.fish.creatures;

/**
 * Created by larissa on 25.11.15.
 */
public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void eat() {
        System.out.println(name + " eating Goldfish");
    }
}