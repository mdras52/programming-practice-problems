package com.mdras52.jpe.pe6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordAnagramDeterminerTest {

    @Test
    public void testSimple() {
        assertTrue(WordAnagramDeterminer.isAnagram("god", "dog"));
    }

    @Test
    public void testDuplicates() {
        assertTrue(WordAnagramDeterminer.isAnagram("good", "ogdo"));
    }

    /**
     * See the method javadoc for interpretation of this test case
     */
    @Test
    public void testSpacesAndCapitalization() {
        assertTrue(WordAnagramDeterminer.isAnagram("Dormitory", "Dirty Room"));
    }

    @Test
    public void testFailed() {
        assertFalse(WordAnagramDeterminer.isAnagram("Foo", "Bar"));
    }
}
