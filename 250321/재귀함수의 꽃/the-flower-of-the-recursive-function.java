import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        dfs(n);

    }

    public static void dfs(int i){
        if(i<=0){
            return;
        }
        System.out.print(i+" ");
        dfs(i-1);
        System.out.print(i+" ");
    }
}