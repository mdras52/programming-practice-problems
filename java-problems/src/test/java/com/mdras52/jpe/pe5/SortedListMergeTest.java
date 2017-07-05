package com.mdras52.jpe.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by matthewrasler on 7/5/17.
 * Test sorted list merge
 */
public class SortedListMergeTest {

    @Test
    public void simpleTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(3);
        list2.add(9);

        List<Integer> mergedList1 = SortedListMerge.merge(list1, list2);
        List<Integer> mergedList2 = SortedListMerge.merge(list2, list1);
        assertTrue(mergedList1.equals(mergedList2));

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(9);
        expected.add(9);

        assertTrue(mergedList1.equals(expected));
    }

    @Test
    public void emptyListTest() {
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(3);
        list2.add(9);

        List<Integer> mergedList1 = SortedListMerge.merge(list1, list2);
        List<Integer> mergedList2 = SortedListMerge.merge(list2, list1);
        assertTrue(mergedList1.equals(mergedList2));

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(3);
        expected.add(9);

        assertTrue(mergedList1.equals(expected));
    }

    @Test
    public void smallerLeftTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(3);
        list2.add(9);

        List<Integer> mergedList1 = SortedListMerge.merge(list1, list2);
        List<Integer> mergedList2 = SortedListMerge.merge(list2, list1);
        assertTrue(mergedList1.equals(mergedList2));

        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(9);

        assertTrue(mergedList1.equals(expected));
    }

    @Test
    public void smallerRightTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(9);

        List<Integer> mergedList1 = SortedListMerge.merge(list1, list2);
        List<Integer> mergedList2 = SortedListMerge.merge(list2, list1);
        assertTrue(mergedList1.equals(mergedList2));

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(9);
        expected.add(9);

        assertTrue(mergedList1.equals(expected));
    }
}
