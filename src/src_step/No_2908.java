package src_step;

import java.util.Scanner;

public class No_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str = sc.nextLine();
        int[] num = new int[2];
        String[] arr = str.split(" ");
        for (int i = 0; i < 2; i++) {
            sb.append(arr[i]);
            arr[i] = sb.reverse().toString();
            sb.delete(0,sb.length());
            num[i] = Integer.parseInt(arr[i]);
        }
        if (num[0]>num[1])
            System.out.println(num[0]);
        else
            System.out.println(num[1]);
    }
}
