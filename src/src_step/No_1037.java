package src_step;

import java.util.Arrays;
import java.util.Scanner;

public class No_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (c==1)
            System.out.println(arr[0]*arr[0]);
        else
            System.out.println(arr[0]*arr[c-1]);
    }
}
