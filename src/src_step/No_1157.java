package src_step;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class No_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int pre = 1;
        char ch = 0;
        int[] arr = new int[26];
        String str = sc.nextLine().toUpperCase(Locale.ROOT);
        String[] str_arr = str.split("");
        Arrays.sort(str_arr);
        str = String.join("",str_arr);
        if (str.length()==1){
            System.out.println(str);
            System.exit(0);
        }
        for (char c = 'A'; c <= 'Z'; c++,index++){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==c){
                    arr[index] +=1;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (pre < arr[i]){
                pre = arr[i];
                ch = (char) (i+65);
            }else if (pre == arr[i]){
                ch = (char) 63;
            }
        }
        System.out.println(ch);
    }
}
