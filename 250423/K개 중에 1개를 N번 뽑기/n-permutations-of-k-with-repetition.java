import java.util.Scanner;
import java.util.*;

public class Main {

    static int nowTurn=1;
    static int[] cards;
    static int n;

    static List<String> result= new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        n = sc.nextInt();

        cards = new int[k+1];
        int j=1;
        for(int i=1; i<=k; i++){
            cards[i]=j++;
        }


        String num = "";
        dfs(nowTurn,num);


        // Please write your code here.

result.forEach(e -> System.out.println(e));

        
    }

    public static void dfs(int nowTurn, String num){
        if(nowTurn>n){
            result.add(num);
            return;
        }

        for(int i=1; i<cards.length; i++){
           
                nowTurn++;

                String createdNum = String.valueOf(num.isEmpty()?new StringBuilder().append(cards[i]):new StringBuilder().append(num).append(" ").append(cards[i]));

                dfs(nowTurn,createdNum);

                nowTurn--;
              
                

            
        }

    }
}