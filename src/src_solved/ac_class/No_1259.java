package src_solved.ac_class;

import java.util.Scanner;

public class No_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int i = 0;
        String[] arr = new String[100];
        while (n!=0){
            String str = sc.nextLine();
            if (str.equals("0")){
                break;
            }
            StringBuffer sb = new StringBuffer(str);
            String str_re = sb.reverse().toString();
            if (str.equals(str_re)){
                arr[i] = "yes";
            } else {
                arr[i] = "no";
            }
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}
