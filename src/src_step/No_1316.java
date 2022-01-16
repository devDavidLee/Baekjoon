package src_step;

import java.util.Scanner;

public class No_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String[] str_arr = new String[N];
        for (int i = 0; i < N; i++) {
            str_arr[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            if (check(str_arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(String str){
        boolean[] al = new boolean[26];
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            if (p != n){
                p = n;
                if (!al[p - 'a']){
                    al[p-'a'] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
