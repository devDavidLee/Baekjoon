package src_solved.ac_class;

import java.util.Scanner;

public class No_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
    }

    private static int factorial(int n) {
        if (n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
