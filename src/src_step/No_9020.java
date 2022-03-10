package src_step;

import java.util.Scanner;

public class No_9020 {
    static boolean[] isPrime = new boolean[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        isPrime_fun();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int half_n = n/2;
            for (int j = half_n; j > 0; j--) {
                if (isPrime[j] && isPrime[n-j]){
                    if (n-j<j){
                        sb.append(n-j+" "+j+"\n");
                    }else{
                        sb.append(j+" "+(n-j)+"\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
    private static void isPrime_fun(){
        boolean p = true;
        for (int i = 1; i < 10001; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    p = false;
                    break;
                }
            }
            if (p){
                if (i!=1)
                    isPrime[i]= true;
            }
            p = true;
        }
    }
}
