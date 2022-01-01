package src_step;

import java.util.Scanner;

public class No_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        int count = 0;
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
            int size = strings[i].length();
            for (int j = 0; j < size; j++) {
                if (strings[i].charAt(j) == 'O') {
                    count = 1 + count;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            strings[i] = Integer.toString(sum);
            sum = 0;
            count = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }
}
