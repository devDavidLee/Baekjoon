package src_step;

import java.util.Scanner;
import java.util.Stack;

public class No_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int K = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num!=0){
                stack.push(num);
            }else {
                stack.pop();
            }
        }
        if (stack.size()==0){
            sum = 0;
        }else {
            while (stack.size()!=0){
                sum += stack.pop();
            }
        }
        System.out.println(sum);
    }
}
