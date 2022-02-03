package src_step;

import java.util.Scanner;

public class No_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));
    }
    private static int gcd(int a, int b){
        if (a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
