package algorithms;

public class PrimeSum {

    public static void main(String[] args) {

        System.out.println("Resultado= "+primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num = 0, count,i;
        //insert your code here
        while(num<=maxNum){
            count = 0;
            i = 2;
            while(i <= num/2 )
            {
                if(num % i == 0)
                {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && num != 1 )
            {
                sum = sum + num;
            }
            
            num++;
        }

        return sum;
    }
}