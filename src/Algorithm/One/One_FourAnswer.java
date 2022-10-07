package Algorithm.One;

import java.util.Scanner;

public class One_FourAnswer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int x = 1;
        int y = 1;  // int x = 1, y = 1; 식으로 선언해줘도 된다.
        String[] plans = sc.nextLine().split(" ");

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        String[] move_types = {"L", "R", "U", "D"}; // char[] moveTypes = {'L', 'R', 'U', 'D'};

        int nx = 0;
        int ny = 0;

        for (String plan : plans) {
            // int nx = -1, ny = -1;
            for (int i = 0; i < move_types.length; i++) {

                if (plan.equals(move_types[i])) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                }

            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }

}
