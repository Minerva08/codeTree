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

        int left = 0;
        int right = maxHour*m;

        while(left<right){
            int mid = (left+right)/2;
            int pCnt = 0;
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