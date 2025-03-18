import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // Please write your code here.

       long left = 1;
       long right = Long.MAX_VALUE; 

       long min = Long.MAX_VALUE;

       while(left<=right){
            long mid = (right+left)/2;
            
            if(passedNum(mid)<n){
                left = mid+1;
            }else{
                min =Math.min(mid,min);
                right = mid-1;
            }

       }

       System.out.println(min);

    }

    public static long passedNum(long mid){
        long multiple_3Cnt = mid/3;
        long multiple_5Cnt = mid/5;
        long multiple_15Cnt = mid/15; 

        long mooCnt  = multiple_3Cnt+multiple_5Cnt-multiple_15Cnt;
        return mid-mooCnt;
    }
}