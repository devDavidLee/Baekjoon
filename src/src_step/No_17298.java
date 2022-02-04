package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

public class No_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] num_str = br.readLine().split(" ");
        Integer[] num = Stream.of(num_str).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty()&&num[stack.peek()]<num[i]){
                num[stack.pop()] = num[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            num[stack.pop()] = -1;
        }
        for (int i = 0; i < N; i++) {
            sb.append(num[i]).append(" ");
        }
        System.out.println(sb);
    }
}
