package examples;

import examples.maximum.Maximum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static ArrayList<Integer> integers = new ArrayList<>(List.of(
            18, 505, -3000, 42, 0 , 350, 202, 53, 14, 975
    ));

    public static void main(String[] args) {
        System.out.println("Højeste til er: " + Maximum.maximum(integers));
    }
}
