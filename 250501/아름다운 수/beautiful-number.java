import java.util.Scanner;
import java.util.*;

public class Main {

    static int size;
    static List<String> nums = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        // Please write your code here.


        dfs(0,"");


        System.out.println(nums.size());

    }

    public static void dfs(int tryCnt, String beautifulNum){
        if(size<=tryCnt){
            if(size==tryCnt){
                nums.add(beautifulNum);
            }
            return;
        }
        for(int i=1; i<5;i++){
            
            StringBuilder repeatSb  = new StringBuilder();
            for(int j=1; j<=i; j++){
                repeatSb.append(String.valueOf(j));
            }
            StringBuilder sb = new StringBuilder().append(beautifulNum).append(repeatSb.toString());
            dfs(tryCnt+i,sb.toString());
        }
    }
}