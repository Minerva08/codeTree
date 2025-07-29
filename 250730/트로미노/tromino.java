import java.util.Scanner;

public class Main {

    static int[][][] blocks = new int[][][]{{{0,0},{1,0},{1,1}},{{0,0},{0,1},{0,2}}};

    static int max = 0;
    static int n,m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        //  블럭 종류별
        for(int i=0; i<2; i++){
            // 블럭 회전
            // 오른쪽 90도 : {{0,0+1},{1-1,0},{1,1-1}}
            int rotateCnt=0;
            while(rotateCnt<=3){
                for(int l=0; l<n; l++){
                    for(int j=0; j<m; j++){
                        int sum = 0;
                        for(int k=0; k<3; k++){
                            int nextX = blocks[i][k][0]+l;
                            int nextY = blocks[i][k][1]+j;
                            if(!inRange(nextX,nextY)){
                                sum=0;
                                break;
                            }
                            sum+=grid[nextX][nextY];
                        }
                        if(max<sum){
                            max = sum;
                        }


                    }
                }

                int[][] rotateBlock = rotate(blocks[i],i);
                rotateCnt++;

            }

            
           
        }
        System.out.println(max);

        
    }
    public static boolean inRange(int x, int y){
        if(x<0 || x>=n || y<0 || y>=m){
            return false;
        }
        return true;

    }

    public static int[][] rotate(int[][] origin, int blockType){
        int[][] rotate = new int[3][2];

        int px = origin[0][0];
        int py = origin[0][1];

        for (int i = 0; i < 3; i++) {
            int x = origin[i][0];
            int y = origin[i][1];

            int nx = px + (y - py);
            int ny = py - (x - px);
            rotate[i] = new int[] {nx,ny};

        }
        blocks[blockType] = rotate;

        return rotate;
    }

    
}