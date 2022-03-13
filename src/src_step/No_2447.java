package src_step;

import java.util.Scanner;

public class No_2447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        String[][] arr = new String[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = " ";
            }
        }
        solved(arr,0,0,N);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void solved(String[][] arr, int x, int y, int n){
        if (n==1){
            arr[x][y]="*";
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i!=1 || j!=1)
                    solved(arr,x+i*(n/3),y+j*(n/3),n/3);
            }
        }
    }
}
