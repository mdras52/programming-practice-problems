package com.mdras52.jpe.pe5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewrasler on 7/5/17.
 * Merge two sorted list
 */
public class SortedListMerge {


    /**
     * Takes O(l + r) space and O(l + r) time
     * @param left to merge
     * @param right to merge
     * @param <E> Comparable type
     * @return left and right merged in such a way as the returned list elements are in comparable order and contains
     * all elements of left and right
     * Copy is shallow
     */
    public static <E extends Comparable<? super E>> List<E> merge(List<E> left, List<E> right) {
        List<E> merged = new ArrayList<>();
        if(right.isEmpty()) {
            merged.addAll(left);
            return merged;
        }

        if(left.isEmpty()) {
            merged.addAll(right);
            return merged;
        }


        int j = 0;

        for (E li : left) {
            while (j < right.size() && li.compareTo(right.get(j)) > 0) {
                merged.add(right.get(j));
                j++;
            }

            merged.add(li);
        }

        //add tail of right if bigger
        for(; j < right.size(); j++) {
            merged.add(right.get(j));
        }

        return merged;

    }
}
