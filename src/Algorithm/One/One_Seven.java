package Algorithm.One;

import java.util.Arrays;
import java.util.Scanner;

public class One_Seven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i) - 48 < 10 ){
                sum += (int)s.charAt(i)-48;
            }else {
                count++;
            }
        }

        char arr[] = new char[count];
        count = 0;
        for(int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i) >= 65){
                arr[count] = s.charAt(i);
                count++;
                System.out.println(s.charAt(i));
            }
        }
            Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.print(sum);
    }
}
