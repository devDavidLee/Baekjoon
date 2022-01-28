package src_step;

import java.util.*;

public class No_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        member[] m = new member[N];
        for (int i = 0; i < N; i++) {
            m[i] = new member(sc.nextInt(), sc.next(), i);
        }
        Comparator<member> sort_member = new Comparator<member>() {
            int result = 0;
            @Override
            public int compare(member o1, member o2) {
                if (o1.age > o2.age){
                    result = 1;
                }
                else if (o1.age == o2.age){
                    result = 0;
                }
                else {
                    result = -1;
                }
                return result;
            }
        };
        Arrays.sort(m,sort_member);
        for (int i = 0; i < N; i++) {
            System.out.println(m[i].age+" "+m[i].name);
        }
    }
}
class member {
    int age;
    int index;
    String name;

    public member(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }
}
