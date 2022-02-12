package src_step;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int j = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size()!=1){
            if (j%2==0){
                queue.poll();
                j++;
            }else if (j%2==1){
                queue.add(queue.poll());
                j++;
            }
        }
        System.out.println(queue.peek());
    }
}
