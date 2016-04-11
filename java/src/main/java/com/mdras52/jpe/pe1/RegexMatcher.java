package com.mdras52.jpe.pe1;

/**
 * Created by matthewrasler on 4/10/16.
 */
public class RegexMatcher {

    /**
     * See question-list.md for a full list of contract specifications for this method, but in summary will return
     * true if the input matches the toMatchExp and false otherwise.
     * ? and * are the only supported matching characters
     *
     * Returns false if input or toMatchExp are null or empty
     *
     * @param input to match
     * @param toMatchExp that possibly contains special regular expression characters
     * @return true if matches, false otherwise
     */
    public static boolean match(String input, String toMatchExp) {
        //contract validation
        if(input == null || input.isEmpty() || toMatchExp == null || toMatchExp.isEmpty())
            return false;

        //get rid of some cases for quick return and also to simplify the problem
        if(!toMatchExp.contains("*"))
            return simpleMatch(input, toMatchExp);

        //the only case left is toMatchExp contains a star
        return starMatch(input, toMatchExp, 0, 0);
    }


    /*
     * The cases here are: contains only '?' or doesn't contain any special characters
     */
    private static boolean simpleMatch(String input, String toMatchExp) {
        //simple case
        if(input.length() != toMatchExp.length())
            return false;

        //simple iterative matching
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != toMatchExp.charAt(i) && toMatchExp.charAt(i) != '?')
                return false;
        }

        return true;
    }

    /*
     * All cases here should have a star in the toMatchExp
     */
    private static boolean starMatch(String input, String toMatchExp, int inputPointer, int expPointer) {
        //ran to the end without finding a no match scenario
        if(inputPointer == input.length() || expPointer == toMatchExp.length())
            return true;

        //at the end of the input or toMatchExp and nothing to compare to
        if((inputPointer == input.length() && expPointer != toMatchExp.length()) || (inputPointer != input.length() && expPointer == toMatchExp.length()))
            return false;

        //if this pair matches in simple cases, iterate
        if(toMatchExp.charAt(expPointer) == '?' || toMatchExp.charAt(expPointer) == input.charAt(inputPointer))
            return starMatch(input, toMatchExp, inputPointer + 1, expPointer + 1);

        //check if this character is a star
        if(toMatchExp.charAt(expPointer) == '*')
            return starMatch(input, toMatchExp, inputPointer + 1, expPointer + 1) || starMatch(input, toMatchExp, inputPointer + 1, expPointer) || starMatch(input, toMatchExp, inputPointer, expPointer + 1);

        //no match
        return false;
    }


}
