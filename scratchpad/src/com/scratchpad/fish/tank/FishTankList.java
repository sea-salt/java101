package com.scratchpad.fish.tank;

import com.scratchpad.fish.creatures.Fish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by larissa on 27.11.15.
 */
public class FishTankList implements FishTank {
    private List fishList;

    public FishTankList() {
        fishList = new ArrayList();
    }

    @Override
    public Fish getFish(int index) {
        return null;
    }

    @Override
    public boolean addFish(Fish fish) {
        return false;
    }

    @Override
    public boolean removeFish(Fish fish) {
        return false;
    }

    @Override
    public void print() {
        int x = 5;
        String message = x > 4 ? "Happy" : "Sad";
//        if (x > 4) {
//            message = "Happy";
//        }
//        else {
//            message = "Sad";
//        }
        System.out.println(message);
    }
}
