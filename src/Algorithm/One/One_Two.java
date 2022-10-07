package Algorithm.One;

import java.util.Arrays;
import java.util.Scanner;

public class One_Two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int sum = s.charAt(0) - '0';

        for(int i = 1; i < s.length(); i++){
            int num = s.charAt(i) - '0';
            if(num <= 1 || sum <= 1){
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
