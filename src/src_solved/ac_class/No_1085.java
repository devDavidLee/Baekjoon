package src_solved.ac_class;

import java.util.Scanner;

public class No_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = 0;
        if (x>y)
            min = y;
        else
            min = x;
        if (w-x>h-y && min>h-y){
            min = h-y;
        } else if (w-x<h-y && min>w-x){
            min = w-x;
        }
        System.out.println(min);
    }
}
