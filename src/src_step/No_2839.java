package src_step;

import java.util.Scanner;

public class No_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = -1;
        if (N%5 == 0){
            count = N/5;
        } else {
            for (int i = 0; i <= N/5; i++) {
                if ((N-i*5)%3 == 0){
                    count = i + (N-i*5)/3;
                }
            }
        }
        System.out.println(count);
    }
}
