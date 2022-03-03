package src_step;

import java.util.Scanner;

public class No_11729 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        count = (int) (Math.pow(2,N)-1);
        hanoi(N,1,2,3);
        System.out.println(count+"\n"+sb);
    }

    private static void hanoi(int n, int start, int by, int end) {
        if (n==1) {
            sb.append(start+" "+end+"\n");
        }else {
            hanoi(n-1,start,end,by);
            sb.append(start+" "+end+"\n");
            hanoi(n-1,by,start,end);
        }
    }
}
