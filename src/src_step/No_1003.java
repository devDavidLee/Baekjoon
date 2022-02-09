package src_step;

import java.util.Scanner;

public class No_1003 {
    static int cnt0 = 0;
    static int cnt1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr = new int[T][2];
        for (int i = 0; i < T; i++) {
            cnt0 = 0; cnt1 = 0;
            int n = sc.nextInt();
            fibo(n);
            arr[i][0] = cnt0;
            arr[i][1] = cnt1;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }

    private static int fibo(int n){
        if (n==0){
            cnt0++;
            return 0;
        } else if (n==1){
            cnt1++;
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
