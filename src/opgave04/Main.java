package opgave04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(15, 0, -23, 42, 101, Integer.MIN_VALUE, 202, 0, -3));
        System.out.println(mergeSort(integers));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        if (list.size()==1){
            return list;
        }
        else {
            int mid = list.size()/2;
            return merge(mergeSort(new ArrayList<>(list.subList(0,mid))),mergeSort(new ArrayList<>(list.subList(mid,list.size()))));
        }

    }


    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int i1 = 0;
            int i2 = 0;
            while (i1 < list1.size() && i2 < list2.size()) {
                if (list1.get(i1).compareTo((list2.get(i2))) <= 0) {
                    result.add(list1.get(i1));
                    i1++;
                }
                else {
                    result.add(list2.get(i2));
                    i2++;
                }
            }
            while (i1 < list1.size()) {
                result.add(list1.get(i1));
                i1++;
            }
            while (i2 < list2.size()) {
                result.add(list2.get(i2));
                i2++;
            }
            return result;
    }

}
