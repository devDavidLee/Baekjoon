package src_step;

import java.util.Scanner;

public class No_14490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(":");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        System.out.println(n/gcd(m,n)+":"+m/gcd(m,n));
    }
    private static int gcd(int a, int b){
        if (a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
}
