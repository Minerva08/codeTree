import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
       
        long minTurn = m;
        long maxTurn = 0;
        
        for(long j=a; j<=b; j++){
            int cnt=0;

            //이진탐색
            long target = j;
            long left=1;
            long right=m;
            while(left<=right){
                long mid = (left+right)/2;

                if(mid==target){
                    cnt++;
                    break;
                }else if(mid>target){
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