package src_step;

import java.util.Scanner;

public class No_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            int sum = i;
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.charAt(j)+"");
            }
            if (sum == N){
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
}
