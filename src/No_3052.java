import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class No_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] array_num = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            set.add(num%42);
        }
        System.out.println(set.size());
    }
}
