package src_step;

import java.util.*;

public class No_18258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int back = 0;
        int x = 0;
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            if (str.contains("push")) {
                x = Integer.parseInt(str.substring(str.indexOf("push") + 5));
                back = x;
                queue.add(x);
            } else if (str.contains("pop")) {
                if (!queue.isEmpty())
                    sb.append(queue.poll()+"\n");
                else
                    sb.append(-1+"\n");
            } else if (str.contains("size")) {
                sb.append(queue.size()+"\n");
            } else if (str.contains("empty")) {
                if (queue.isEmpty())
                    sb.append(1+"\n");
                else
                    sb.append(0+"\n");
            } else if (str.contains("front")) {
                if (!queue.isEmpty())
                    sb.append(queue.peek()+"\n");
                else
                    sb.append(-1+"\n");
            } else if (str.contains("back")){
                if (!queue.isEmpty())
                    sb.append(back+"\n");
                else
                    sb.append(-1+"\n");
            }
        }
        System.out.println(sb);
    }
}
