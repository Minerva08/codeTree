import java.util.*;
public class Main {
    public static class Num implements Comparable<Num>{
        String num;
        int fistNum;

        public Num(int num){
            this.num = String.valueOf(num);
            this.fistNum = (int)(num/Math.pow(this.num.length(),10));
        }

        @Override
        public int compareTo(Num n){
            if(n.fistNum==this.fistNum){
                // 오름차순
                return Integer.compare(this.num.length(),n.num.length());
            }
            // 내림차순
            return Integer.compare(n.fistNum,this.fistNum);

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
            sb.append(String.valueOf(arr[i].num));
        }
        System.out.println(sb);
    }
}