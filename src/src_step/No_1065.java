package src_step;

import java.util.Scanner;

public class No_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] num = new int[4];
        for (int i = 1; i <= N; i++) {
            if (i<100){
                count++;
            }else if (i==1000){
                break;
            }else {
                int length = (int) (Math.log10(i)+1);
                int number = i;
                for (int j = 0; j < length; j++) {
                    num[j] = number%10;
                    number /= 10;
                }
                if ((num[0]-num[1])==(num[1]-num[2]))
                    count++;
            }
        }
        System.out.println(count);
    }
}
