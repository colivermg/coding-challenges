package algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class NumberRepeated {

    public static void main (String[] args){
        int [] numbers={1, 2, 8, 7, 10, 5, 0, 35, 100, 9, 200, 250, 101, 0};

        /*for(int x=0; x < numbers.length; x++){

            int aux=numbers[x+1];

            if (numbers[x] == aux) {
                System.out.println(numbers[x]);
                System.out.println(aux);
                System.out.println("el numero repetido es: "+numbers[x]);
            }
        }*/

        Set<Integer> setNumbers= new HashSet<>();

        for(int x=0; x < numbers.length; x++){
            if(setNumbers.contains(numbers[x])){
                System.out.println("El numero repetido es: "+numbers[x]);
            } else{
                setNumbers.add(numbers[x]);
            }
        }

        //O(N) complexity time
        //O(1) complexity espace
        //Notacion Big O revisar

    }
}
