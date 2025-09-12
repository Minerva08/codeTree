import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int maxV = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<N; i++){
            if((sum+a[i])<=0){
                sum=a[i];
          
            }else{
                sum+=a[i];              
            }
            maxV = Math.max(maxV,sum);

            
        }

        System.out.println(maxV);

    }
}