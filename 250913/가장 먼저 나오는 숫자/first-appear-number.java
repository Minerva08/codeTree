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
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] result = new int[m];

        for(int i=0; i<m; i++){
            int target = queries[i];

            int left=0;
            int right = n-1;
            int minIdx=n;

            while(left<=right){
                int mid = (left+right)/2;

                if(target<=arr[mid]){
                    if(target==arr[mid]){
                       minIdx = Math.min(minIdx,mid);
                    }  
                    right = mid-1;

                }else{
                    // target>mid
                    left= mid+1;
                }

            }

            if(minIdx==n){
                result[i]=-1;
            }else{
                result[i] = minIdx+1;

            }


        }


        for(int i=0; i<m; i++){
            System.out.println(result[i]);
        }
        
    }
}