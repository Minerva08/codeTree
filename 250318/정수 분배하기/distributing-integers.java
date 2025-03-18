import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);

        int left = 1;
        int right = arr[n-1];
        int result =0;
        
        while(left<=right){
            int mid = (right+left)/2;
            int cnt = 0;

            for(int i=0; i< n;  i++){
                cnt += (int) (arr[i]/mid);
            }

            if(cnt>=m){
                // mid 증가
                result = mid;  
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        System.out.println(result);



    }
}