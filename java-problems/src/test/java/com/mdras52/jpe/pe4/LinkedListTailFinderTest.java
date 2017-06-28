package com.mdras52.jpe.pe4;

import org.junit.Test;

import java.awt.*;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by ma059ra on 6/28/17.
 * To test the LinkedListTailFinder
 */
public class LinkedListTailFinderTest {

    @Test
    public void testEmptyList() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(LinkedListTailFinder.subList(5, list).isEmpty());
    }

    @Test
    public void testSize1list() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        assertTrue(LinkedListTailFinder.subList(0, list).size() == 1);
    }

    @Test
    public void testListElements() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("fa");
        LinkedList<String> returnedList = LinkedListTailFinder.subList(1, list);
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");
    }

    @Test
    public void testBackingWrapper() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("fa");
        LinkedList<String> returnedList = LinkedListTailFinder.subList(1, list);
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        list.add("more");
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        list.remove("bar");
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        returnedList.add("bar");
        assertFalse(list.contains("bar"));
    }

    @Test
    public void testEmptyListDeep() {
        LinkedList<String> list = new LinkedList<>();
        assertTrue(LinkedListTailFinder.subListDeep(5, list).isEmpty());
    }

    @Test
    public void testSize1listDeep() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        assertTrue(LinkedListTailFinder.subListDeep(0, list).size() == 1);
    }

    @Test
    public void testListElementsDeep() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("fa");
        LinkedList<String> returnedList = LinkedListTailFinder.subListDeep(1, list);
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");
    }

    @Test
    public void testBackingWrapperDeep() {
        LinkedList<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("fa");
        LinkedList<String> returnedList = LinkedListTailFinder.subListDeep(1, list);
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        list.add("more");
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        list.remove("bar");
        assertEquals(returnedList.get(0), "bar");
        assertEquals(returnedList.get(1), "fa");

        returnedList.add("bar");
        assertFalse(list.contains("bar"));
    }

    @Test
    public void testShallowCopy() {
        LinkedList<Point> list = new LinkedList<>();

        Point a = new Point(100, 200);
        Point b = new Point(50, 20);

        list.add(a);
        list.add(b);
        LinkedList<Point> returnedList = LinkedListTailFinder.subList(1, list);
        assertEquals(returnedList.get(0).getX(), 50, 0.0001);
        assertEquals(returnedList.get(0).getY(), 20, 0.0001);

        b.move(70, 90);
        assertEquals(returnedList.get(0).getX(), 70, 0.0001);
        assertEquals(returnedList.get(0).getY(), 90, 0.0001);
    }


    @Test
    public void testDeepCopy() {
        LinkedList<Point> list = new LinkedList<>();

        Point a = new Point(100, 200);
        Point b = new Point(50, 20);

        list.add(a);
        list.add(b);
        LinkedList<Point> returnedList = LinkedListTailFinder.subListDeep(1, list);
        assertEquals(returnedList.get(0).getX(), 50, 0.0001);
        assertEquals(returnedList.get(0).getY(), 20, 0.0001);

        b.move(70, 90);
        assertEquals(returnedList.get(0).getX(), 50, 0.0001);
        assertEquals(returnedList.get(0).getY(), 20, 0.0001);
    }

}
