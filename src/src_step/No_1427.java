package src_step;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        Arrays.sort(str, Collections.reverseOrder());
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }
}
