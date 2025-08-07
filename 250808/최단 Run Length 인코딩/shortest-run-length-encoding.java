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


            Map<Character,Integer> result = new HashMap<>();
            result.put(arr[0],1);

            for(int k=1; k<arr.length; k++){
                if(arr[k] != arr[k-1]){
                    result.put(arr[k],1);
                }else{
                    result.put(arr[k],result.get(arr[k])+1);
                }
            }

            int cnt =result.size();
            for(Entry<Character, Integer> encodingMap :result.entrySet()){
                if(encodingMap.getValue()>9){
                    cnt+=2;
                }else{
                    cnt++;
                }
            }

            min = Math.min(cnt,min);
        
        }
        System.out.println(min);


    }
}