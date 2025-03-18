import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        // Please write your code here.

        long left = 1;
        long right = sum;
        long result = -1;

        while(left<=right){
            long mid = (right+left)/2;

            long s = 0l;

            for(long i=1; i<=mid; i++){
                s+=i;

            }


            if(s<=sum){
                result = Math.max(result, mid);
                left=mid+1;

            }else if(s>sum){
                right=mid-1;
            }
        }
        System.out.println(result);



    }
}