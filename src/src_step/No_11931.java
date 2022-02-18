package src_step;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_11931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        for (int i = N-1; i >= 0; i--) {
            sb.append(arrayList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
