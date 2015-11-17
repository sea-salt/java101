package com.scratchpad.fish;

/**
 * Created by larissa on 01.11.15.
 */
public class Goldfish extends Fish {

    public Goldfish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println(" swim blub swim");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
