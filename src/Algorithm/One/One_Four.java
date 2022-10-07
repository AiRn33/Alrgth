package Algorithm.One;

import java.util.Scanner;

public class One_Four {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 1;
        int y = 1;
        sc.nextLine();
        String a = sc.nextLine();

        for(int i = 0; i < a.length(); i++){

            switch (a.charAt(i)){

                case 'L':
                    if(x - 1 >= 1){
                        x--;
                    }
                    break;
                case 'R':
                    if(x + 1 <= n){
                        x++;
                    }
                    break;
                case 'U':
                    if(y - 1 >= 1){
                        y--;
                    }
                    break;
                case 'D':
                    if(y + 1 <= n){
                        y++;
                    }
                    break;
            }
        }

        System.out.print(y + " " + x);
    }
}
