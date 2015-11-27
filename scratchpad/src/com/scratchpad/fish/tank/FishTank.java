package com.scratchpad.fish.tank;

import com.scratchpad.fish.creatures.Fish;

/**
 * Created by larissa on 27.11.15.
 */
public interface FishTank {

    Fish getFish(int index);

    boolean addFish(Fish fish);

    boolean removeFish(Fish fish);

    void print();
}
