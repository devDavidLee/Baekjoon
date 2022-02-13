package src_step;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = sc.nextInt();
        int K = sc.nextInt();
        int j = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size()!=0){
            if (j%K==0){
                if (queue.size()==1)
                    sb.append(queue.poll());
                else
                    sb.append(queue.poll()+", ");
            } else {
                queue.add(queue.poll());
            }
            j++;
        }
        sb.append(">");
        System.out.println(sb);
    }
}
