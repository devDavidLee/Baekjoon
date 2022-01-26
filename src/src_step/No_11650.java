package src_step;

import java.util.Arrays;
import java.util.Scanner;

public class No_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int prev = arr[0][0];
        int[][] temp = new int[1][2];
        for (int i = 1; i < N; i++) {
            if (arr[i][0]<prev){
                //prev = arr[i][0];
                temp[0] = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp[0];
            } else {
                prev = arr[i][0];
            }
        }
        int temp_;
        prev = arr[0][1];
        for (int i = 1; i < N; i++) {
            if (arr[i][0] == arr[i-1][0]){
                if (arr[i][1]<prev){
                    temp_ = arr[i-1][1];
                    arr[i-1][1] = arr[i][1];
                    arr[i][1] = temp_;
                } else {
                    prev = arr[i][1];
                }
            }
            for (int j = 1; j < N; j++) {
                if (arr[j][1]<arr[j-1][1] && arr[i][0] == arr[i-1][0] && i==N-1){
                    i=1;
                    continue;
                }
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(prev);
    }
}
