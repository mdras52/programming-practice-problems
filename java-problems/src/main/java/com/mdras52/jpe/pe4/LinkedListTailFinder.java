package com.mdras52.jpe.pe4;

import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by ma059ra on 6/28/17.
 * Finds the nth through last element of a LinkedList
 */
public class LinkedListTailFinder {


    /**
     * Assumptions made:
     *  If index is greater than size() - 1, then empty List is returned
     *  If list is null, then empty list is returned
     *  Index is zero based
     *  Copys are shallow
     *
     * Easy implementation using the standard Java package libraries
     *
     * @param index first index to start
     * @param list to search
     * @param <E> type
     * @returna LinkedList from the index to the tail shallow copying elements
     */
    public static <E> LinkedList<E> subList(int index, LinkedList<E> list) {
        if(list == null || index > list.size() - 1)
            return new LinkedList<>(); //or return null, or throw an exception

        return new LinkedList<>(list.subList(index, list.size()));
    }


    /**
     * Assumptions made:
     *  If index is greater than size() - 1, then empty List is returned
     *  If list is null, then empty list is returned
     *  Index is zero based
     *  Copys are deep
     *
     * Easy implementation using the standard Java package libraries
     *
     * @param index first index to start
     * @param list to search
     * @param <E> type
     * @returna LinkedList from the index to the tail deep copying elements
     */
    public static <E extends Serializable> LinkedList<E> subListDeep(int index, LinkedList<E> list) {
        LinkedList<E> finishedList = new LinkedList<>();
        for(E e : subList(index, list)) { //instead of relying on the subList method, break this out for space consideration
            finishedList.add((E)SerializationUtils.clone(e));
        }

        return finishedList;
    }


}
