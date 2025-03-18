import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int lb = lowerBound(a);
            int ub = upperBound(b);

            System.out.println(ub-lb);
        }
        
        // Please write your code here.
    }

    public static int lowerBound(int num){
        int left = 0;
        int right = arr.length;

        while(left<right){
            int mid = (right+left)/2;

            if(arr[mid]>=num){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public static int upperBound(int num){
        int left = 0;
        int right =  arr.length;

        while(left<right){

            int mid = (right+left)/2;

            if(arr[mid]>num){
                right=mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}