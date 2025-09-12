import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int maxV = a[0];
        int sum = a[0];

        for (int i = 1; i < N; i++) {
            sum = Math.max(a[i], sum + a[i]); // 핵심
            maxV = Math.max(maxV, sum);
        }

        System.out.println(maxV);
    }
}
