package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr.add(i,Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for (int i : arr) {
            str.append(i).append("\n");
        }
        System.out.println(str);
    }
}
