import java.util.*;
import java.util.Map.Entry;

public class Main {


    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        char[] arr = A.toCharArray();

        for(int i=0; i<arr.length; i++){
            char lastAlpha = arr[arr.length-1];
            for(int j=(arr.length-1); j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = lastAlpha;


            StringBuilder result = new StringBuilder();
            int cnt=1;
            for(int k=1; k<arr.length; k++){
                if(arr[k] != arr[k-1]){
                    result.append(arr[k-1]).append(cnt);
                    cnt=1;
                }else{
                    cnt++;
                }
            }

            result.append(arr[arr.length - 1]).append(cnt);

            min = Math.min(result.length(),min);

        }
        System.out.println(min);


    }
}



