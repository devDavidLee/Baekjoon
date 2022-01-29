package src_step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No_2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int mean; int median; int mode; int range;
        mean = (int) Math.round(sum/N);
        median = arr[N/2];
        range = arr[N-1]-arr[0];
        int[] index = new int[8001];
        for (int i = 0; i < N; i++) {
            index[arr[i]+4000]++;
        }
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> mode_list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (index[i]>max){
                max = index[i];
            }
        }
        for (int i = 0; i < 8001; i++) {
            if (index[i]==max){
                mode_list.add(i-4000);
            }
        }
        Collections.sort(mode_list);
        if (mode_list.size()>1){
            mode = mode_list.get(1);
        }else {
            mode = mode_list.get(0);
        }
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
