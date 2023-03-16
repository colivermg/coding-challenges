package algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class SumTargetArray {

    public static void main(String[] args) {
        int[] input = { 1, 10, 2, 0, 80, 100, 55, 13, 999, 15 };
        SumTargetArray app = new SumTargetArray();
        int[] position= app.solve(input, 1000);
        System.out.print("{"+position[0]+" , "+position[1]+"}");
    }

    private int[] solve(int[] arr, int target) {
        int[] result = new int[2];

        for(int x = 0; x < arr.length; x++){
            int numToSearch=target-arr[x];
            for(int y=1; y < arr.length; y++){
                if (arr[y]==numToSearch) {
                    result[0]=arr[x];
                    result[1]=numToSearch;
                }
            }
        }

        return result;
    }

    /*private int[] solve2(int[] arr, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> pivote= new HashMap<>();
        for(int x = 0; x < arr.length; x++){
           pivote.put(x, arr[x]);
           if(arr[x]+pivote.get()){

           }

        }

        return result;
    }*/


}
