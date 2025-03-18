import java.util.*;
public class Main {

    static int[] arr ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.

        for(int num :  queries){
            System.out.println(lowerBound(num));
        }


        
    }

    public static int lowerBound(int num){
        int left = 0;
        int right = arr.length;

        while(left<right){
            int mid = (right+left)/2;

            if(arr[mid] >= num){
                right = mid;
            }else{
                left = mid+1;
            }

        }
        if(arr[left] == num){
            return left+1;
        }
        return -1;

    }
}