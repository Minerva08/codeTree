import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int sum = 0;
        while(true){
            Arrays.sort(arr);

            if(arr[1]==Integer.MAX_VALUE){
                System.out.println(sum);

                return;
            }else{
                sum+=(arr[0]+arr[1]);
                arr[0]=(arr[0]+arr[1]);
                arr[1]=Integer.MAX_VALUE;
            }

        }
        

    }
}