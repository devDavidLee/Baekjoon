package src_step;

import java.util.Scanner;

public class No_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;
        int line = 0;
        while (count < X){
            line++;
            count += line;
        }
        if(line %2==0) {
            System.out.println(X- count + line +"/"+(count -X+1));
        }else {
            System.out.println((count -X+1)+"/"+(X- count + line));
        }
    }
}
