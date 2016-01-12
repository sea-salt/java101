package com.scratchpad;

import com.scratchpad.fish.creatures.Fish;
import com.scratchpad.fish.creatures.Goldfish;
import com.scratchpad.fish.creatures.Shark;
import com.scratchpad.fish.tank.FishTank;
import com.scratchpad.fish.tank.FishTankArray;

public class Main {

    public static void main(String[] arguments) {
        Fish felix = new Goldfish("Felix");
        Fish goldy = new Goldfish("Goldy");
        Fish bob = new Shark("Bob");

        FishTank fishTank = new FishTankArray();
//        FishTank fishTank = new FishTankList();
        fishTank.addFish(felix);
        fishTank.addFish(goldy);
        fishTank.addFish(bob);
        fishTank.removeFish(goldy);
//        fishTank.print();

        for (Fish fish : fishTank) {
            System.out.println(fish);
        }


//        String alphabet = "Alphabet";
//        char[] charArray = alphabet.toCharArray();
//        for (char c : charArray) {
//            System.out.println(c);
//        }


//        Object mysteryObject = new Shark("Sharky");
//        if (mysteryObject instanceof Shark) {
//            // conversion from parent to child
//            Shark mysteryShark = (Shark) mysteryObject;
//            // conversion from child to parent
//            Fish fish = mysteryShark;
//            mysteryShark.swim();
//        }

     






















//        boolean equals = felix.equals(goldy);
//        boolean notEquals = !felix.equals(goldy);

//        Person p1 = new Person(18, "Max", "Mueller");
//        Person p2 = new Person(19, "Sarah", "Mueller");
//
//        System.out.println(Calculator.square(9));

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(Person.getNumberOfPeople());


//        for (int i = 3; i >= 0; i--) {
//            System.out.println("iteration: " + i);
//            System.out.println("p1 " + p1.getDirection());
//            p1.turnLeft();
//        }
//
//        int t = 0;
//        while (t < 4) {
//            System.out.println("iteration: " + t);
//            System.out.println("p1 " + p1.getDirection());
//            p1.turnRight();
//            t++;
//        }



    }
}
