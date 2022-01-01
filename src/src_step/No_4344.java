package src_step;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class No_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        ArrayList<Integer> list = new ArrayList<>();
        int c = sc.nextInt();
        String[] result = new String[c];
        double av = 0;
        double sum = 0;
        double count = 0;
        double per = 0;
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(j, sc.nextInt());
                sum += list.get(j);
            }
            av = sum/n;
            for (int j = 0; j < n; j++) {
                if (list.get(j)>av){
                    count++;
                }
            }
            per = count/n * 100;
            result[i] = df.format(per);
            per = 0;
            count = 0;
            sum = 0;
            av = 0;
        }
        for (int i = 0; i < c; i++) {
            System.out.println(result[i]+"%");
        }
    }
}
