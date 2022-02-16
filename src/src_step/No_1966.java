package src_step;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            Queue<int[]> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, sc.nextInt()});
            }
            int count = 0;
            while (true){
                int[] now = queue.poll();
                boolean bool = true;
                for (int[] q: queue) {
                    if (q[1]>now[1]){
                        bool = false;
                        break;
                    }
                }
                if (bool){
                    count++;
                    if (now[0]==M)
                        break;
                }else {
                    queue.add(now);
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
