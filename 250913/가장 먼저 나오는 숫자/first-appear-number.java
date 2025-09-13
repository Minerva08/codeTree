import java.util.Scanner;
public class Main {

    // 하한값 찾기
    // lowerBound

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

        for(int i=0; i<m; i++){

            // 이진 탐색
            int target = queries[i];
            // 하한값/상한값은 범위이므로 일치하지 않아도됨
            //left<right
            // <= 가 아니라 < 를 쓰는 이유는 mid를 right = mid 로 줄여나가기 때문 )
            int left = 0;
            int right = n-1;
            // int minIdx= -1;
            while(left<right){
                int mid = (left+right)/2;

                if(target<=arr[mid]){
                    //정확히 일치하는 값의 위치 중 최소를 찾아야 하므로
                    // if(target==arr[mid]){
                    //     minIdx=mid;
                    // }
                    right = mid;
                }else{
                    left = mid+1;
                }
                
            }
            System.out.println((left<n) && (arr[left]==target)? (left+1):-1);
        }
    }
}