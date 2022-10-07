package Algorithm.One;

import java.util.Scanner;

public class One_one {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int check = n % k;
        int count = 0;

        if(check > 0){
            while(check > 0) {
                n -= 1;
                check--;
                count++;
            }

            while(n != 1){

                n = n / k;
                count++;
            }
        }else if(check == 0){

            while(n != 1){

                n = n / k;
                count++;
            }

        }

        System.out.println(count);
    }
}
