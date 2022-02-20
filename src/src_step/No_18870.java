package src_step;

import java.util.*;

public class No_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[N];
        LinkedHashMap<Integer, Integer> arr_m = new LinkedHashMap<>();
        LinkedHashMap<Integer, Integer> com = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            com.put(a, 0);
        }
        int[] arr_copy = arr.clone();
        int count = 0;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                arr_m.put(arr[i], i);
            } else if (i > 0 && arr[i] != arr[i - 1]) {
                arr_m.put(arr[i], i-count);
            } else {
                count++;
            }
        }
//        for (int i = 0; i < N; i++) {
//            System.out.print(arr_m.get(arr[i])+" ");
//        }
//        System.out.println();
        for (int i = 0; i < N; i++) {
            com.replace(arr[i], arr_m.get(arr[i]));
        }
        for (int i = 0; i < N; i++) {
            sb.append(com.get(arr_copy[i]) + " ");
        }
        System.out.println(sb);
    }
}
