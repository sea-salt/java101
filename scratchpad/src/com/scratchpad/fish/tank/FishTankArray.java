package com.scratchpad.fish.tank;

import com.scratchpad.fish.creatures.Fish;

/**
 * Created by larissa on 05.11.15.
 */
public class FishTankArray implements FishTank {
    private Fish[] fishArray;

    public FishTankArray() {
        fishArray = new Fish[3];
    }

    @Override
    public Fish getFish(int index) {
        Fish fishy = fishArray[index];
        return fishy;
    }

    @Override
    public boolean addFish(Fish fish) {
        // [null, null, null] = 3
        //   0     1     2
        for (int i = 0; i < fishArray.length; i++) {
            Fish fishAtIndex = fishArray[i];
            if (fishAtIndex == null) {
                fishArray[i] = fish;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeFish(Fish fish) {
        for (int i = 0; i < fishArray.length; i++) {
            Fish fishAtIndex = fishArray[i];
            if (fishAtIndex.equals(fish)) {
                fishArray[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        for (Fish fish : fishArray) {
            System.out.println(fish);
        }
    }

}
