import java.util.Scanner;
public class Main {
    static int n;
    static int[][] grid;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(inRange(i+2,j+2)){
                    int sum = 0;
                    for(int k=i;k<i+3;k++){
                        for(int l=j;l<j+3; l++){
                            sum+=grid[k][l];
                        }
                    }
                    max = Math.max(max,sum);
                }

            

            }
        }

        System.out.println(max);
    }

    public static boolean inRange(int x, int y){

        if(x<0 || x>=n || y<0 || y>=n){
            return false;
        }
        return true;
    }
}