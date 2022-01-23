package src_step;

import java.util.Scanner;

public class No_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        int pos_n = 0;
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            double dis = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
            if (dis>r1+r2)
                pos_n = 0;
            else if (dis < Math.abs(r1-r2))
                pos_n = 0;
            else if (dis==0 && r1==r2)
                pos_n = -1;
            else if (dis == r1+r2 || dis == Math.abs(r1-r2))
                pos_n = 1;
            else if (dis<r1+r2)
                pos_n = 2;
            arr[i] = pos_n;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i]);
        }
    }
}
