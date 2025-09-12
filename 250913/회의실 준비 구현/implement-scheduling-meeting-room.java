import java.util.*;
public class Main {

    public static class Metting implements Comparable<Metting>{
        int start;
        int end;

        public Metting(int s, int e){
            this.start = s;
            this.end = e;
        }

        @Override
        public int compareTo(Metting m){
            return Integer.compare(this.end, m.end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Metting> mettingList = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            mettingList.add(new Metting(s,e));
        }

        Collections.sort(mettingList);
        // Please write your code here.

        // 시작시간은 항상 종료시간보다 작거나 같다!!
        // 종료시간 기준 오름차순 정렬 가능
        // A종료 -> B시작
        // 회의가 언제 시작했나 보다 <<< 언제 종료하나가 더 중요
        int prevEnd = mettingList.get(0).end;
        int cnt=1;
        for(int i=1; i<n;i++){
            if(prevEnd<=mettingList.get(i).start){
                cnt++;
                prevEnd = mettingList.get(i).end;

            }
        }
        System.out.println(cnt);





    }
}