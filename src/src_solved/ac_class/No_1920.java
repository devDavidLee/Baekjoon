package src_solved.ac_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        String[] A_str = new String[N];
        A_str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(A_str[i]);
        }
        Arrays.sort(A);
        int M = Integer.parseInt(br.readLine());
        int[] X = new int[M];
        String[] X_str = new String[M];
        X_str = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            X[i] = Integer.parseInt(X_str[i]);
        }
        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(A,X[i]) >= 0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
