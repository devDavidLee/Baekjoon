package src_step;

import java.util.Scanner;

public class No_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] tc = new int[T];
        for (int i = 0; i < T; i++) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
            int sum = 0;
            int k = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < k; j++) {
                sum = 0;
                for (int l = 0; l < n; l++) {
                    sum += arr[l];
                    arr[l] = sum;
                }
            }
            tc[i] = arr[n-1];
        }
        for (int i = 0; i < T; i++) {
            System.out.println(tc[i]);
        }
    }
}
