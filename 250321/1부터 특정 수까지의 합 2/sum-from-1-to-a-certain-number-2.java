import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.

        dfs(1,0);
    }

    public static void dfs(int i, int sum){
        if(i>n){
            System.out.println(sum);
            return ;
        }
        dfs(i+1, sum+i);
    }
}