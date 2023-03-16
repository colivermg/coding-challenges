package algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class MergedLists {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {0, 2, 4, 6, 8, 10, 11};

        //int[] resultado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //https://github.com/jhmoreno85/
        //https://github.com/jhmoreno85/coding-challenge-project
        MergedLists mergedLists=new MergedLists();
        Set<Integer> list= mergedLists.mergeLists(a, b);
        System.out.println(list);

    }

    private Set<Integer> mergeLists(int[] a, int[] b){

        Set<Integer> mergedList= new HashSet<Integer>();


        for(int x=0; x< a.length;x++){
            for(int y=0; y<b.length;y++){
                if(a[x]<b[y] ){
                    mergedList.add(a[x]);
                    break;
                } else{
                    mergedList.add(b[y]);
                }
            }

        }


        return mergedList;
    }

}
