package opgave03;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Janus", "Markus", "Peter", "Line", "Mads", "Søren", "Mathias", "Trine", "Anders"));
        int number = countStringsOfLength(names, 5);
        System.out.println("number = " + number);
        System.out.println();
        printElementsOfLength(names, 5);
        System.out.println();
        System.out.println("Navne med længde = 5 : " + elementsOfLength(names, 5));
    }


    /**
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return the number of elements in strings with the specified length
     */
    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        return countStringsOfLength(strings,length,0,strings.size()-1);
    }

    private static int countStringsOfLength(ArrayList<String> strings,int length, int low, int high){
        if (low>=high){
            if (strings.get(low).length()==length){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int result = 0;
            int mid = (low+high)/2;
            result+=countStringsOfLength(strings,length,low,mid);
            result+=countStringsOfLength(strings,length,mid+1,high);
            return result;
        }
    }


    /**
     * Writes the elements of strings to the console with the specified lenght
     * @param strings ArrayList of elements
     * @param length the length to test for
     */
    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        printElementsOfLength(strings,length,0,strings.size()-1);
    }

    public static void printElementsOfLength(ArrayList<String> strings, int length, int low, int high){
        if (low>=high){
            if (strings.get(low).length()==length){
                System.out.println(strings.get(low));
            }
        }
        else {
            int mid = (low+high)/2;
            printElementsOfLength(strings,length,low,mid);
            printElementsOfLength(strings,length,mid+1,high);
        }
    }

    /**
     *
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return a new ArrayList with all elements from strings with the specified lenght
     */
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        return elementsOfLength(strings,length,0,strings.size()-1);
    }

    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length, int low, int high){
        ArrayList<String> stringsResult = new ArrayList<>();
        if (low>=high){
            if (strings.get(low).length()==length){
                stringsResult.add(strings.get(low));
                return stringsResult;
            }
        }
        else {
            int mid = (low+high)/2;
            stringsResult.addAll(elementsOfLength(strings,length,low,mid));
            stringsResult.addAll(elementsOfLength(strings,length,mid+1,high));
        }
        return stringsResult;
    }
}
