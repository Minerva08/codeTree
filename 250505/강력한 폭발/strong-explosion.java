
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static class Locate {

        int dx;
        int dy;

        public Locate(int dx, int dy) {
            if (dx >= 0 && dx < n && dy >= 0 && dy < n) {
                this.dx = dx;
                this.dy = dy;
            } else {
                this.dx = n;
                this.dy = n;
            }

        }
    }

    public static class Boom {

        Locate locate;

        public Boom(Locate locate) {
            this.locate = locate;
        }

    }

    public static class Type1 extends Boom {

        Locate area1;
        Locate area2;
        Locate area3;
        Locate area4;

        public Type1(Locate locate) {
            super(locate);
            int x = locate.dx;
            int y = locate.dy;

            this.area1 = new Locate(x-2, y);
            this.area2 = new Locate(x-1, y );

            this.area3 = new Locate(x+1, y);
            this.area4 = new Locate(x+2, y );

        }

    }

    public static class Type2 extends Boom {

        Locate area1;
        Locate area2;
        Locate area3;
        Locate area4;

        public Type2(Locate locate) {
            super(locate);
            int x = locate.dx;
            int y = locate.dy;

            this.area1 = new Locate(x, y - 1);
            this.area2 = new Locate(x - 1, y);

            this.area3 = new Locate(x, y + 1);
            this.area4 = new Locate(x + 1, y);

        }

    }

    public static class Type3 extends Boom {

        Locate area1;
        Locate area2;
        Locate area3;
        Locate area4;

        public Type3(Locate locate) {
            super(locate);
            int x = locate.dx;
            int y = locate.dy;

            this.area1 = new Locate(x - 1, y - 1);
            this.area2 = new Locate(x + 1, y - 1);

            this.area3 = new Locate(x + 1, y + 1);
            this.area4 = new Locate(x - 1, y + 1);

        }

    }

    static int n;

    static int[][] grid;

    static int answer = Integer.MIN_VALUE;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

        List<Locate> booms = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int isBoom = sc.nextInt();
                grid[i][j] = isBoom;
                if (isBoom == 1) {
                    booms.add(new Locate(i, j));
                }

            }
        }

        dfs(booms, new int[n][n]);
        // Please write your code here.

        System.out.println(answer);


    }

    public static void dfs(List<Locate> booms, int[][] result) {

        if (booms.isEmpty()) {
            Set<String> affectedCells = new HashSet<>();

            for (int i = 0; i < n; i++) {
                // System.out.println();
                for (int j = 0; j < n; j++) {
                    // System.out.print(result[i][j]+" ");

                    switch (result[i][j]) {
                        case 1:
                            affectedCells.add(i + "," + j); // 설치된 셀

                            Type1 boom1 = new Type1(new Locate(i, j));
                            addIfValid(affectedCells, boom1.area1);
                            addIfValid(affectedCells, boom1.area2);
                            addIfValid(affectedCells, boom1.area3);
                            addIfValid(affectedCells, boom1.area4);
                            break;
                        case 2:
                            affectedCells.add(i + "," + j);

                            Type2 boom2 = new Type2(new Locate(i, j));
                            addIfValid(affectedCells, boom2.area1);
                            addIfValid(affectedCells, boom2.area2);
                            addIfValid(affectedCells, boom2.area3);
                            addIfValid(affectedCells, boom2.area4);
                            break;
                        case 3:
                            affectedCells.add(i + "," + j);

                            Type3 boom3 = new Type3(new Locate(i, j));
                            addIfValid(affectedCells, boom3.area1);
                            addIfValid(affectedCells, boom3.area2);
                            addIfValid(affectedCells, boom3.area3);
                            addIfValid(affectedCells, boom3.area4);
                            break;
                    }
                }

            }

            answer = Math.max(answer, affectedCells.size());

            return;

        }

        for (int i = 1; i <= 3; i++) {
            Locate loc = booms.get(0);

            int[][] installed = new int[n][n];

            for (int j = 0; j < n; j++) {
                installed[j] = Arrays.copyOf(result[j], n);
            }

            installed[loc.dx][loc.dy] = i;

            List<Locate> used = booms.stream()
                .map(l -> new Locate(l.dx, l.dy))
                .collect(Collectors.toList());

            used.remove(0);

            dfs(used, installed);
        }


    }


    private static void addIfValid(Set<String> set, Locate loc) {

        if (loc.dx < n && loc.dy < n) {
            set.add(loc.dx + "," + loc.dy);
        }
    }


}
