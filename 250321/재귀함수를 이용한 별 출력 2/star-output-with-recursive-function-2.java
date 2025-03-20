import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        dfs(n);
    }

    public static void dfs(int i){
        if(i<1){
            return;
        }
        for(int j=0;j<i; j++){
            System.out.print("* ");

        }
        System.out.println();
        dfs(i-1);
        for(int j=0;j<i; j++){
            System.out.print("* ");

        }
                System.out.println();

        
    }
}