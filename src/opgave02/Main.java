package opgave02;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(0, 14, 0, 42, 0, -1, 0 , 101));
        int numberOfZeros = countZeros(integers);
        System.out.println(numberOfZeros);
    }

    private static int countZeros(ArrayList<Integer> integers) {
        return countZeros(integers,0,integers.size()-1);
    }

    private static int countZeros(ArrayList<Integer> integers, int low, int high){
        if (low>=high){
            if (integers.get(low)==0){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int mid = (low+high)/2;
            int result = 0;
            result+=countZeros(integers,low,mid);
            result+=countZeros(integers,mid+1,high);
            return result;
        }
    }
}
