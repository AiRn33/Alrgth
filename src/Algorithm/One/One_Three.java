package Algorithm.One;

import java.util.Arrays;
import java.util.Scanner;

public class One_Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result= 0;
        int count = 0;

        for(int i = 0; i < n; i++){

            count += 1;
            System.out.println("i : " + i);
            System.out.println("count : " + count);
            System.out.println("arr[i] : " + arr[i]);
            System.out.println("result : " + result);
            System.out.println("-------------------");

            if(count >= arr[i]){
                result += 1;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
