import java.util.*;
public class Main {

    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y =y;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        // Please write your code here.


        Arrays.sort(points, Comparator.comparingInt((Point p) -> p.x)
                              .thenComparingInt(p -> p.y));


        int start = 0;
        int end = start+1;
        int preY=0;
        int min = Integer.MAX_VALUE;

        while(start<=end && end<n){

            if((yGap(points[end].y, points[start].y))>=d){
                int xGap = points[end].x - points[start].x;
                min = Math.min(min,xGap);
                start++;

            }else{
                end++;
            }

            
        }

        System.out.println(min);
        
        
    }

    public static int yGap(int y2, int y1){
        return y2-y1;
    }
}