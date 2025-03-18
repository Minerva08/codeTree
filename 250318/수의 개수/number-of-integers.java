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

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
           int start =  lowerBound(num);
           int end =  upperBound(num);

           System.out.println(end-start);
            // Please write your code here.
        }

        
    }

        public static int lowerBound(int num) {
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int mid = (right + left) / 2;

                if (arr[mid] >= num) {
                    right = mid; // 'num' 이상인 값을 찾을 때 right를 mid로 이동
                } else {
                    left = mid + 1;
                }
            }
            return left; // left가 찾은 인덱스를 반환
        }

        public static int upperBound(int num) {
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int mid = (right + left) / 2;

                if (arr[mid] > num) {
                    right = mid; // 'num'보다 큰 값을 찾을 때 right를 mid로 이동
                } else {
                    left = mid + 1;
                }
            }
            return left; // left가 찾은 인덱스를 반환
        }

   
}