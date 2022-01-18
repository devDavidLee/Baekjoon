package src_solved.ac_class;

import java.util.Scanner;

public class No_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int num = 1;
        while (N != count){
            num++;
            if (String.valueOf(num).contains("666"))
                count++;
        }
        System.out.println(num);
    }
}
