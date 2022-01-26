package src_step;

import java.util.Arrays;
import java.util.Scanner;

public class No_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[][] str = new String[T][2];
        for (int i = 0; i < T; i++) {
            str[i] = sc.nextLine().split(",");
        }
        for (int i = 0; i < T; i++) {
            str[i][0] = String.valueOf(Integer.parseInt(str[i][0])+Integer.parseInt(str[i][1]));
        }
        for (int i = 0; i < T; i++) {
            System.out.println(str[i][0]);
        }
    }
}
