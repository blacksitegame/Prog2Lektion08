package examples.sorting;

import java.util.ArrayList;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {

    }

    private static <T> void swap(ArrayList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));

    }
}
