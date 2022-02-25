package src_step;

import java.util.Scanner;

public class No_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        int preZ = (int) (100*Y/X);
        int nowZ = 0;
        int count = 0;
        if (preZ>=99){
            count = -1;
        }else {
            while (nowZ<=preZ){
                X++; Y++;
                count++;
                nowZ = (int) (100*Y/X);
            }
        }
        System.out.println(count);
    }
}
