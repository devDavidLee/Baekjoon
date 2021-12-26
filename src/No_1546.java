import java.util.*;

public class No_1546 {
    public static void main(String[] args) {
        int N;
        ArrayList<Integer> list = new ArrayList<>();
        double av = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        double M = Collections.max(list);
        for (int i = 0; i < N; i++) {
             av += list.get(i)/M*100;
        }
        System.out.println(av/N);
    }
}
