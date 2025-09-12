import java.util.*;
public class Main {
    public static class Num implements Comparable<Num>{
        String num;
    
        public Num(int num){
            this.num = String.valueOf(num);
        }

        @Override
        public int compareTo(Num n){

            String s1 = n.num + this.num;
                String s2 = this.num + n.num;
                return s1.compareTo(s2);
            // 내림차순
            

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] arr = new Num[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Num(sc.nextInt());
        }
        // Please write your code here.
        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            sb.append(arr[i].num);
        }
        System.out.println(sb);
    }
}