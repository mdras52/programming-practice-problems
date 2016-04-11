package com.mdras52.jpe.pe1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by matthewrasler on 4/10/16 to test the RegexMatcher class
 */
public class RegexMatcherTest {

    @Test
    public void TestQuestionMark1() {
        String input = "Hello";
        String expression = "He??o";

        assertTrue(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestQuestionMark2() {
        String input = "Hello";
        String expression = "He???o";

        assertFalse(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestQuestionMark3() {
        String input = "Helro";
        String expression = "He??o";

        assertTrue(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestIdentity() {
        String input = "Hello";
        String expression = "Hello";

        assertTrue(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestStar1() {
        String input = "Hello";
        String expression = "H*llo";

        assertTrue(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestStar2() {
        String input = "Hello";
        String expression = "He*o";

        assertTrue(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestStar3() {
        String input = "abbc";
        String expression = "abc*";

        assertFalse(RegexMatcher.match(input, expression));
    }

    @Test
    public void TestStar4() {
        String input = "bc";
        String expression = "**bc";

        assertTrue(RegexMatcher.match(input, expression));
    }


}
