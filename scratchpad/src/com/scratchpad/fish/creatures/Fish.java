package com.scratchpad.fish.creatures;

/**
 * Created by larissa on 01.11.15.
 */
public abstract class Fish {
    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.print(name + " swim swim swim");
        eat();
    }

    public abstract void eat();

    @Override
    public String toString() {
        return name;
    }

}
