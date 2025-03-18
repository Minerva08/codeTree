import java.util.*;
public class Main {

    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            System.out.println(search(x));
        }
    }


    public static int search (int num){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]>num){
                end = mid-1;

            }else if(arr[mid]==num){
                return (mid+1);

            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
