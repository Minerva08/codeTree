import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.



        for(int i=0; i<t; i++){
            int bottomTemp=bottom[n-1];
            int topTemp=top[n-1];

            for(int j=n-2; j>=0; j--){
                top[j+1] = top[j];
            }
            top[0] =bottomTemp; 

            for(int k=n-2; k>=0; k--){
                bottom[k+1] = bottom[k];
            }
            bottom[0] = topTemp;


        }
            for(int j=0; j<n; j++){
                System.out.print(top[j]+ " ");
            }
            System.out.println();
            for(int j=0; j<n; j++){
                System.out.print(bottom[j]+ " ");
            }
        
    }
}