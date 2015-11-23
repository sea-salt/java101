package com.scratchpad.fish;

/**
 * Created by larissa on 01.11.15.
 */
public class Fish implements FishInterface {
    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.print(name + " swim swim swim");
    }

    @Override
    public String toString() {
        return name;
    }

}
