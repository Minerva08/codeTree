import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자 크기
        int m = sc.nextInt(); // 금 한 조각 가격

        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt(); // 금 조각 개수
            }
        }

        int[][] dp = new int[n][n];

        // 0번째 열은 dp에 금 조각 그대로 초기화
        for (int i = 0; i < n; i++) {
            dp[i][0] = grid[i][0];
        }

        // 1열부터 오른쪽 끝까지 dp 채우기
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int maxPrev = dp[i][j - 1];
                if (i > 0) maxPrev = Math.max(maxPrev, dp[i - 1][j - 1]);
                if (i < n - 1) maxPrev = Math.max(maxPrev, dp[i + 1][j - 1]);
                dp[i][j] = grid[i][j] + maxPrev;
            }
        }

        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, dp[i][n - 1]);
        }

        System.out.println(maxGold);
    }
}
