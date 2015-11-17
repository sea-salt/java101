package com.scratchpad.fish;

/**
 * Created by larissa on 05.11.15.
 */
public class FishTank {
    private Fish[] fishArray = new Fish[3];

    public FishTank() {


    }

    public Fish getFish(int index) {
        Fish fishy = fishArray[index];
        return fishy;
    }

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

    public void print() {
        for (Fish fish : fishArray) {
            System.out.println(fish);
        }
    }

}
