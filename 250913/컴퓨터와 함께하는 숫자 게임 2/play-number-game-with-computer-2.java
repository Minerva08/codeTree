import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        // Please write your code here.
        long[] nums = new long[(int)m];

        for(int i=1; i<m; i++){
            nums[i] = i;
        }
        long minTurn = m;
        long maxTurn = 0;
        
        for(long j=a; j<=b; j++){
            int cnt=0;

            //이진탐색
            long target = j;
            long left=0;
            long right=m+1;
            while(left<=right){
                long mid = (left+right)/2;

                if(nums[(int)mid]==target){
                    cnt++;
                    break;
                }else if(nums[(int)mid]>target){
                    right=mid-1;
                }else{
                    left = mid+1;
                }
                cnt++;
            }

            minTurn = Math.min(minTurn,cnt);
            maxTurn = Math.max(maxTurn,cnt);
        }
        System.out.println(minTurn+" "+maxTurn);



    }
}