package src_step;

import java.math.BigInteger;
import java.util.Scanner;

public class No_10826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    private static BigInteger fibo(int n){
        BigInteger[] fibo_arr = new BigInteger[n+2];
        fibo_arr[0] = BigInteger.valueOf(0);
        fibo_arr[1] = BigInteger.valueOf(1);
        if (n>1){
            for (int i = 2; i <= n; i++) {
                fibo_arr[i] = fibo_arr[i-2].add(fibo_arr[i-1]);
            }
        }
        return fibo_arr[n];
    }
}
