import java.util.Scanner;
  
public class Main {
    static int n,m;
    static int[][] grid;
    static int totalCnt=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        // Please write your code here.

        if(m==1){
            System.out.println(2*n);
            return;
        }
        

        // 행
        for(int i=0; i<n ;i++){
            int cnt=0;
            int prev = grid[i][0];
            for(int j=1; j<n; j++){
                if(prev==grid[i][j]){
                    cnt++;
                    if(cnt==m-1){
                        totalCnt++;
                        break;
                    }
                }else{
                    cnt=0;
                    prev=grid[i][j];
                }
            }

        }

        // 열
        for( int k=0; k<n; k++){
            int cnt=0;
            int prev = grid[0][k];
            for(int l=1; l<n; l++){

                if(prev==grid[l][k]){
                    cnt++;
                    if(cnt==m-1){
                        totalCnt++;
                        break;
                    }
                }else{
                    cnt=0;
                    prev=grid[l][k];
                }
            }
        
        }
        System.out.println(totalCnt);

    }



    
}