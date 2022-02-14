package src_step;

import java.util.Scanner;

public class No_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int h = C/60;
        int m = C%60;
        int eh = A+h;
        int em = B+m;
        if (em>60){
            eh += em/60;
            em = em%60;
        }else if (em==60){
            em = 0;
            eh+=1;
        }
        if (eh>23){
            eh = eh-24;
        }
        System.out.println(eh+" "+em);

    }
}
