package src_step;

import java.util.Arrays;
import java.util.Scanner;

public class No_2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int[] A = new int[10];
            for (int j = 0; j < 10; j++) {
                A[j] = sc.nextInt();
            }
            Arrays.sort(A);
            arr[i] = A[7];
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}
