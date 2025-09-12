import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(coins);
        //내림차순
        for (int i = 0; i < coins.length / 2; i++) {
            int tmp = coins[i];
            coins[i] = coins[coins.length - 1 - i];
            coins[coins.length - 1 - i] = tmp;
        }
        int cnt =0;
        for(int c : coins){
            cnt+=(k/c);
            k=(k%c);
        
        }

        System.out.println(cnt);

    }
}