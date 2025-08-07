import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        // Please write your code here.

        for(int j=0; j<t; j++){
            int lLast = l[n-1];
            int rLast = r[n-1];
            int dLast = d[n-1];

          
            for(int i=n-1; i>0; i--){
                l[i]=l[i-1];
            }
            
            for(int i=n-1; i>0; i--){
                r[i]=r[i-1];
            }
           
            for(int i=n-1; i>0; i--){
                d[i]=d[i-1];
            }

            d[0] = rLast;
            l[0] = dLast;
            r[0] = lLast;

        }

        for(int intl: l){
            System.out.print(intl+" ");
        }
        System.out.println();

        for(int intr: r){
            System.out.print(intr+" ");
        }
        System.out.println();


        for(int intd: d){
            System.out.print(intd+" ");
        }
        System.out.println();

    }

    
}