import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int maxHour = 0;
        for (int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
            maxHour = Math.max(arr[i],maxHour);}
        // Please write your code here.

        long left = 1;
        long right = maxHour*m;

        while(left<right){
            long mid = (left+right)/2;
            long pCnt = 0;
            for(int i=0; i<m; i++){
                pCnt+=(mid/arr[i]);
            }

            if(pCnt>=n){
                right = mid;
            }else{
                left=mid+1;
            }
        }

        System.out.println(left);
    }
}