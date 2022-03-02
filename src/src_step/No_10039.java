package src_step;

import java.util.Scanner;

public class No_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int g = sc.nextInt();
            if (g<=40)
                g=40;
            sum += g;
        }
        System.out.println(sum/5);
    }
}
