import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long k = sc.nextInt();
        sc.close();

        long left = 1, right = N * N, answer = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = countLessThanOrEqual(mid, N);

            if (count >= k) {
                answer = mid; // mid가 정답 후보
                right = mid - 1; // 더 작은 값을 찾기 위해 이동
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static long countLessThanOrEqual(long x, long N) {
        long count = 0;
        for (long i = 1; i <= N; i++) {
            count += Math.min(N, x / i); // i번째 행에서 x 이하의 개수
        }
        return count;
    }
}
