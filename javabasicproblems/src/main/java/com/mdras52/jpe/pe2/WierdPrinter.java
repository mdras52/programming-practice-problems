package com.mdras52.jpe.pe2;

/**
 * Created by matthewrasler on 4/10/16.
 */
public class WierdPrinter {

    public static final String WIERD = "Wierd";
    public static final String NOT_WIERD = "Not Wierd";


    /**
     * See PE2 problem definition for contract of this method
     * @param input int from 1 < N <= 100 to check
     * @return the printed string for test ease
     */
    public static String printWierdness(int input) {
        //guarantee the method contract
        if(input < 1 || input > 100)
            throw new RuntimeException("Contract of printWierdness method not fullfilled with input of " + input);

        //odd
        if(input % 2 != 0) {
            System.out.println(WIERD);
            return WIERD;
        }

        //all even at this point
        if(input >= 6 && input <= 20) {
            System.out.println(WIERD);
            return WIERD;
        }

        System.out.println(NOT_WIERD);
        return NOT_WIERD;

    }
}
