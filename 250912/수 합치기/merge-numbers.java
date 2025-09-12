import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return Integer.compare(a,b);
        });

        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }
        // Please write your code here.
        int sum = 0;
        while(pq.size()>1){
            int num1= pq.poll();
            int num2 = pq.poll();
            sum+=(num1+num2);
            pq.offer(num1+num2);
            
        }
        System.out.println(sum);


        
        

    }
}