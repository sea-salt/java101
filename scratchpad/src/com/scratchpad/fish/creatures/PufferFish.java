package com.scratchpad.fish.creatures;

/**
 * Created by larissa on 27.11.15.
 */
public class PufferFish extends Fish {

    public PufferFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void eat() {
        System.out.println(name + " is munching rice puffs");
    }
}
