import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength=0;
        int start=0;

        for(int end=0; end<n; end++){
            int endNum = arr[end];
            int endNumCnt = map.getOrDefault(endNum,0);
            map.put(endNum,endNumCnt+1);
            

            while(map.getOrDefault(endNum,0)>k && start<=end){
                
                int startNum = arr[start];
                int startNumCnt = map.getOrDefault(startNum,0);
                
                
                if(startNumCnt==1){
                    map.remove(startNum);
                }else {
                    map.put(startNum, startNumCnt-1);

                }
                
                start++;
            }

            maxLength = Math.max(maxLength, end-start+1);

        }

        System.out.println(maxLength);
    }
}