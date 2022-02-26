package src_step;

import java.util.Scanner;

public class No_1018 {
    static boolean[][] chess;
    static int min = 64;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        chess = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j)=='W')
                    chess[i][j] = true;
                else if (str.charAt(j)=='B')
                    chess[i][j] = false;
            }
        }
        int row = N-7;
        int col = M-7;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Sovled(i,j);
            }
        }
        System.out.println(min);
    }

    private static void Sovled(int a, int b) {
        int end_row = a+8;
        int end_col = b+8;
        int cnt = 0;
        boolean WB = chess[a][b];
        for (int i = a; i < end_row; i++) {
            for (int j = b; j < end_col; j++) {
                if (chess[i][j]!=WB){
                    cnt++;
                }
                WB = !WB;
            }
            WB = !WB;
        }
        cnt = Math.min(cnt,64-cnt);
        min = Math.min(min,cnt);
    }
}
