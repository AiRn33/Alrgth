package Algorithm.One;

import java.util.Scanner;

public class One_Five {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i <= n; i++) {

            for(int j = 1; j <= 60; j++){

                for(int k = 1; k <= 60; k++){

                    if(i / 10 == 3 || i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}


