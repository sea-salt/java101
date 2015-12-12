package com.scratchpad.fish.tank;

import com.scratchpad.fish.creatures.Fish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by larissa on 27.11.15.
 */
public class FishTankList implements FishTank {
    private List<Fish> fishList;

    public FishTankList() {
        fishList = new ArrayList();
    }

    @Override
    public Fish getFish(int index) {
        return fishList.get(index);
    }

    @Override
    public boolean addFish(Fish fish) {
        return fishList.add(fish);
    }

    public boolean addFish(int index, Fish fish) {
        fishList.add(index, fish);
        return true;
    }

    @Override
    public boolean removeFish(Fish fish) {
        return fishList.remove(fish);
    }

    @Override
    public void print() {
        for (Fish fish : fishList) {
            System.out.println(fish);
        }
//        class/type    variable name   calling method on fishList
//        Iterator<Fish> fishIterator = fishList.iterator();
//        while (fishIterator.hasNext()) {
//            System.out.println(fishIterator.next());
//            fishIterator.remove();
//        }
    }

    @Override
    public Iterator<Fish> iterator() {
        return fishList.iterator();
    }
}
