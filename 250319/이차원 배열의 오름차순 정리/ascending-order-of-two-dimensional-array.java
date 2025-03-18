import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int left = 1, right = N * N, answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = countLessThanOrEqual(mid, N);

            if (count >= k) {
                answer = mid; // mid가 정답 후보
                right = mid - 1; // 더 작은 값을 찾기 위해 이동
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static int countLessThanOrEqual(int x, int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count += Math.min(N, x / i); // i번째 행에서 x 이하의 개수
        }
        return count;
    }
}
