import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        dfs(0);

        
    }

    public static void dfs(int i){
        if(n==i){
            return;
        } 
        System.out.println("HelloWorld");

        dfs(i+1);
    }
}