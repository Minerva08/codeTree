import java.util.Scanner;
public class Main {
    static int max=1;
    static int[][] grid;
    static int m,n;

    // 1.
    // 가로 너비 : w
    // 세로 너비 : h
    // 사각형 범위 내의 양수 판별하기

    // 2. 시뮬레이션을 통해 넓혀 나가기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        // 사각형 범위 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){

                for(int k=0; k<n; k++){
                    for(int l=0; l<m;l++){

                        boolean result = valid(i, j, k, l);
                    
                        if(result && max<(i*j)){
                            max = i*j;
                        }
                    }
                }
                
            }
        }
        System.out.println(max);


    }

    public static boolean valid(int heigth, int width, int x, int y){
        if(inRange(x+heigth-1,y+width-1)){
            for(int i=x; i<x+heigth; i++){
                for(int j=y; j<y+width; j++){
                    if(grid[i][j]<0){
                        return false;
                    }
                    
                }
            }
            
            return true;

        }return false;
        
    }

    public static boolean inRange(int x, int y){
        if(x<0 || x>=n || y<0 || y>=n){
            return false;
        }
      return true;   
    }
    
}