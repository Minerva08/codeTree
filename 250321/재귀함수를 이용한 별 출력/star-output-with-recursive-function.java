import java.util.Scanner;
public class Main {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        // Please write your code here.
        dfs(1);
    }

    public static void dfs(int n){

        if(n>num){
            return;
        }
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        dfs(n+1);

    }
}