package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_10610 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String[] num = bf.readLine().split("");
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] num = N.split("");
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }
        if (sum%3==0 && N.contains("0")){
            Arrays.sort(num);
            for (int i = num.length-1; i >= 0; i--) {
                System.out.print(num[i]);
            }
        }else{
            System.out.println(-1);
        }

    }
}
