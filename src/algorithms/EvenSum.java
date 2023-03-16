package algorithms;

public class EvenSum {

    public static void main(String[] args) {
        int num = 10;
        int even[] = new int[num];
        int sum = 0,j = 0;
        String evennums = "";
        //Insert your code here
        for(j=2; j<=num; j++) {
            if(j%2==0) {
                sum=sum+j;
                evennums=evennums+","+j;
            }
        }
        evennums=evennums.replaceFirst(",","");
        System.out.println(evennums);
        System.out.println(sum);


    }
}