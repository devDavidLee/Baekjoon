package src_step;

import java.util.Scanner;

public class No_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        String[] word = str.split(" ");
        if (word[0].isBlank())
            System.out.println(0);
        else
            System.out.println(word.length);
    }
}
