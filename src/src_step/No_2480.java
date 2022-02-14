package src_step;

import java.util.Scanner;

public class No_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = 0;
        if (a==b&&b==c){
            r = 10000+a*1000;
        }else if (a==b||b==c||a==c){
            if (a==b)
                r = 1000+a*100;
            if (c==b)
                r = 1000+b*100;
            if (a==c)
                r = 1000+a*100;
        }else {
            int max = 0;
            max = Math.max(Math.max(a,b),c);
            r = max*100;
        }
        System.out.println(r);
    }
}
