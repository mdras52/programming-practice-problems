package com.mdras52.jpe.pe3;

/**
 * Created by matthewrasler on 4/10/16.
 */
public class OddEven {


    /**
     * Determines the parity of the input number without using the modulus or division operator
     * @param input to determine parity
     * @return true when the input is even, false otherwise
     */
    public static boolean isEven(int input) {
        //we can cheat pretty easily here with the floorMod function in .Math since 1.8
        //return Math.floorMod(input, 2) == 0;

        //a subtraction example that could potentially be very expensive
//        int i = Math.abs(input);
//
//        while(i >= 0) {
//            if(i == 0)
//                return true;
//            if(i == 1)
//                return false;
//
//            i = i - 2;
//        }

        //this is the fastest that I can think of
        return Integer.toBinaryString(input).endsWith("0");
    }

    public static boolean isOdd(int input) {
        return !isEven(input);
    }
}
