package src_step;

import java.util.Scanner;

public class No_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] G_room = new int[T];
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            if (N%H != 0){
                G_room[i] = N%H * 100 + N/H+1;
            } else if (N%H == 0){
                G_room[i] = H * 100 + N/H;
            }

        }
        for (int i = 0; i < T; i++) {
            System.out.println(G_room[i]);
        }
    }
}
