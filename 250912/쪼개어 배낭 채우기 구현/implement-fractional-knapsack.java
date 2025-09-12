import java.util.*;

public class Main {

    public static class Boosuk implements Comparable<Boosuk> {
        int weight;
        int price;
        double divided;

        public Boosuk(int w, int p) {
            this.weight = w;
            this.price = p;
            this.divided = (double) p / w;
        }

        @Override
        public int compareTo(Boosuk b) {
            return Double.compare(b.divided, this.divided); // 내림차순 (가치/무게 비율 높은 순)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 보석 개수
        int m = sc.nextInt(); // 배낭 최대 무게
        List<Boosuk> bosukList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            bosukList.add(new Boosuk(w, v));
        }

        Collections.sort(bosukList); // 비율 내림차순 정렬

        double maxPrice = 0;
        int remainW = m;

        for (Boosuk b : bosukList) {
            if (remainW == 0) break; // 배낭이 가득 찼으면 종료

            if (b.weight <= remainW) {
                // 전부 담기
                maxPrice += b.price;
                remainW -= b.weight;
            } else {
                // 일부만 담기
                maxPrice += b.divided * remainW;
                remainW = 0;
            }
        }

        System.out.printf("%.3f", Math.round(maxPrice * 1000) / 1000.0);
    }
}
