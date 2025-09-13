import java.util.*;

public class Main {

    // 상한 + 하한 으로 범위 찾기
    // 범위 내 해당하는 점의 개수 찾기
    static int n;
    static int[] points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        
        points = new int[n];
        
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }
                Arrays.sort(points);

        int a, b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            // 이상의 시작 범위
            int lowIdx = lowerBound(Math.min(a,b));
            // 초과의 시작 범위
            int upBound = upperBound(Math.max(a,b));

            System.out.println(upBound-lowIdx);
        }
        
        // Please write your code here.

        
    }

    public static int lowerBound(int target){
        int left = 0;
        int right = n;
        while(left<right){
            int mid = (left+right)/2;
            if(points[mid]>=target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;

    }

    public static int upperBound(int target){
        int left = 0;
        int right = n;
        while(left<right){
            int mid = (left+right)/2;
            if(points[mid]<=target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;

    }
}