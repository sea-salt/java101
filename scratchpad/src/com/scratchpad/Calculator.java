package com.scratchpad;

public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    double divide(double num1, double num2) {
        // 1.8 truncates to 1
        // 1.3 truncates to 1
        // 1.8 rounds to 2
        // 1.3 rounds to 1
        double result = num1 / num2;
        return result;
    }

}
