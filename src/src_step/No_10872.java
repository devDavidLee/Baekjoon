package src_step;

import java.util.Scanner;

public class No_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }

    private static int factorial(int n) {
        if (n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
