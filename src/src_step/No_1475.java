package src_step;

import java.util.Arrays;
import java.util.Scanner;

public class No_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int[] count = new int[9];
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("9"))
                count[6]++;
            else
                count[Integer.parseInt(str[i])]++;
        }
        count[6] = (count[6]+1)/2;
        Arrays.sort(count);
        System.out.println(count[8]);
    }
}
