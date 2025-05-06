import java.util.*;

public class Main {

    static int[][][] poss = new int[][][] {
                    {{-2, 0}, {-1, 0}, {0, 0}, {1, 0}, {2, 0}},//Type1
                    {{0, -1}, {0, 0}, {-1, 0}, {1, 0}, {0, 1}},//Type2
                    {{-1, -1}, {1, -1}, {0, 0}, {-1, 1}, {1, 1,}}//Type3
            };
    static int n;
    static int max = Integer.MIN_VALUE;
    static int[][] visited;
    static List<int[]> booms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int isBoom = sc.nextInt();
                if(isBoom==1){
                    booms.add(new int[]{i,j});
                }
            }
        }

        // Please write your code here.
        visited = new int[n][n];
        dfs(0);

        System.out.println(max);
    }

    public static void dfs(int depth){
        if(depth==booms.size()){

            int sum = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(visited[i][j]>=1){
                        sum++;
                    }
                }
            }

            max = Math.max(sum,max);
            return;

        }
        int[][] affect;

        int[] boomLocated = booms.get(depth);

        for(int i=0; i<3; i++){
    
            affect = poss[i];

            List<int[]> attacked = new ArrayList<>();

            for(int[] loc : affect){
                int x = boomLocated[0]+loc[0];
                int y = boomLocated[1]+loc[1];

                if(x < 0 || y < 0 || x >= n || y >= n) continue;
                attacked.add(new int[]{x,y});
                
            }

            setVisited(attacked, 1); 
            dfs(depth+1);
            setVisited(attacked,-1);

        }


    }
    
    public static void setVisited(List<int[]> attacked, int value) {
        for (int[] area : attacked) {
            visited[area[0]][area[1]] += value;
        }
    }


}