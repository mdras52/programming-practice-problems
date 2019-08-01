package com.mdras52.jpe.pe6;

import java.util.HashMap;
import java.util.Map;

public class WordAnagramDeterminer {


    /**
     * Given two 'words' as input, determine if left is an anagram of right (and vice versa extending from the
     * definition of anagram)
     *
     * During implementation discussion, it was decided to use a definition of 'anagram' that resembles the Merriam
     * Webster interpretation of an anagram being: a word or phrase made by transposing the letters of another word
     * or phrase.  Given the ambiguity of what constitutes a phrase transposition, we will impose the following:
     * All punctuation marks must be present in both left and right with the same count of punctuation characters in
     * both, i.e.: punctuation should be treated just as other word characters.
     *
     * Whitespace characters can and should be omitted from consideration in this implementation to support the notion
     * of transposition of 'phrases'.
     *
     * Capitalization will also be ignored to support transposition of phrases.
     *
     * @param left word
     * @param right word
     * @return true if left is an anagram of right and right is an anagram of left
     */
    static boolean isAnagram(String left, String right) {
        String leftClean = left.replaceAll("\\s", "").toLowerCase();
        String rightClean = right.replaceAll("\\s", "").toLowerCase();

        //quick exit case
        if(leftClean.length() != rightClean.length()) {
            return false;
        }

        //double loop implementations are common, we want to find a better time complexity
        Map<Character, Integer> leftCharacterCounts = mapWord(leftClean);
        Map<Character, Integer> rightCharacterCounts = mapWord(rightClean);

        for(Map.Entry<Character, Integer> entry: leftCharacterCounts.entrySet()) {
            if(!entry.getValue().equals(rightCharacterCounts.get(entry.getKey()))) {
                return false;
            }
        }

        return true;
    }



    private static Map<Character, Integer> mapWord(String word) {
        //.chars() returns an intStream, we can cast to Character for transparency of the algorithm and ease of
        //debugging weighing the cost of the boxing

        //Unicode supplemental characters are not supported, so this needs to be determined if there may be a case for
        //these.  Use codePoints() if needed
        Map<Character, Integer> map = new HashMap<>();
        word.chars().forEach((int i) -> {
            Character c = (char) i;
            if(map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        });
        return map;
    }

}
