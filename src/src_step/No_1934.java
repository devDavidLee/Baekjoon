package src_step;

import java.util.Scanner;

public class No_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int B = sc.nextInt();
            int A = sc.nextInt();
            arr[i] = A*B/gcd(A,B);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
    private static int gcd(int a, int b){
        if (a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
