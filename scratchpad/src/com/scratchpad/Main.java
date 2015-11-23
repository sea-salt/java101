package com.scratchpad;

import com.scratchpad.fish.Fish;
import com.scratchpad.fish.FishInterface;
import com.scratchpad.fish.FishTank;
import com.scratchpad.fish.Goldfish;

public class Main {

    public static void main(String[] arguments) {
        Fish felix = new Fish("Felix");
        Goldfish goldy = new Goldfish("Goldy");
        FishInterface bob = new Goldfish("Bob");


        FishTank fishTank = new FishTank();
        fishTank.addFish(felix);
        fishTank.addFish(goldy);

        fishTank.print();




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
