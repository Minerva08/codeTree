import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();

        long left = 1;
        long right = (long) Math.sqrt(2 * sum); // 범위를 줄여줌
        long max = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long triangularSum = (mid * (mid + 1)) / 2;

            if (triangularSum <= sum) { 
                max = mid;  
                left = mid + 1;  // 더 큰 mid를 탐색
            } else {
                right = mid - 1; 
            }
        }

        System.out.println(max);
    }
}
