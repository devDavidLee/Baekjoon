import java.sql.Array;
import java.util.ArrayList;

public class No_4673 {
    public static int d_fun(int n){
        int sum=0;
        sum += n;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public ArrayList<Integer> find_selfnum(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 1; i <= n; i++) {
            int d_num = d_fun(i);
            if (d_num>n)
                continue;
            list.set(d_num-1,0);
        }
        return list;
    }
    public static void main(String[] args) {
        No_4673 a = new No_4673();
        ArrayList<Integer> list = new ArrayList<>();
        int n = 10000;
        list = a.find_selfnum(n);
        for (int i = 0; i < n; i++) {
            if (list.get(i) != 0)
                System.out.println(list.get(i));
            else
                continue;
        }
    }
}
