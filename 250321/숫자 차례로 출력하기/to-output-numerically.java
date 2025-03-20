import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        // Please write your code here.
        upperDfs(1);
        System.out.println();
        lowerDfs(n);


        
    }
    public static void upperDfs(int i){
        if(i>n){
            return;
        }
                System.out.print(i+" ");

        upperDfs(i+1);

    }
    public static void lowerDfs(int i){
        if(i<1){
            return;
        }
        System.out.print(i+" ");

        lowerDfs(i-1);
    }
}