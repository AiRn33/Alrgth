package Algorithm.One;

import java.util.Scanner;

public class One_Six {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int row = s.charAt(1) - '0';
        int column = s.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 방향 정의
        int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;

        for(int i = 0; i < 8; i++){
            System.out.println("i : " + i);
            System.out.println("row :" + row);
            System.out.println("dx[i] : " + dx[i]);
            System.out.println("colum : " + column);
            System.out.println("dy[i] : " + dy[i]);
            System.out.println("--------------------");

            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];


            if(nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8){
                result++;
            }

        }

        System.out.println(result);
    }
}
