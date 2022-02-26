package src_step;

import java.util.Scanner;

public class No_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[T];
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int data = 1;
            for (int j = 0; j < b; j++) {
                data = (a*data)%10;
            }
            if (data==0)
                num[i] = 10;
            else
                num[i] = data;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(num[i]);
        }
    }
}
