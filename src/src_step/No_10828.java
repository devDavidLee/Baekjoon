package src_step;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class No_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            if (str.contains("push")) {
                stack.push(Integer.parseInt(str.substring(str.indexOf("push") + 5)));
            } else if (str.contains("pop")) {
                if (!stack.isEmpty())
                    sb.append(stack.pop()+"\n");
                else
                    sb.append(-1+"\n");
            } else if (str.contains("size")) {
                sb.append(stack.size()+"\n");
            } else if (str.contains("empty")) {
                if (stack.isEmpty())
                    sb.append(1+"\n");
                else
                    sb.append(0+"\n");
            } else if (str.contains("top")) {
                if (!stack.isEmpty())
                    sb.append(stack.peek()+"\n");
                else
                    sb.append(-1+"\n");
            }
        }
        System.out.println(sb);
    }
}
