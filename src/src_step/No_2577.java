package src_step;

import java.util.Scanner;

public class No_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A*B*C;
        int count=0;
        String str = Integer.toString(result);
        String[] array_str = str.split("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (array_str[j].equals(Integer.toString(i))) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
