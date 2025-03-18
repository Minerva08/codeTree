import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        // Please write your code here.
        
        

        long[] cntArr = new long[(int)(b-a+1)];

        int j=0;

        for(long i=a; i<=b; i++){
            long cnt = 0;
            long left = 1;
            long right = m;
            
            while(left<=right){
                long mid = (left+right)/2;
                cnt++;

                if(mid>i){ 
                    right =mid-1;

                }else if(mid==i){
                    break;

                }else{
                    left= mid+1;
                }
            }
            cntArr[j] = cnt;
            j++;

        }

        long min = Arrays.stream(cntArr).min().getAsLong();

        long max = Arrays.stream(cntArr).max().getAsLong();

        System.out.println(min +" "+max);

    }

}