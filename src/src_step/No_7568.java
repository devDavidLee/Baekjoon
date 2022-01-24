package src_step;


import java.util.Arrays;
import java.util.Scanner;

public class No_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Person[] person = new Person[N];
        int[] rank = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            person[i] = new Person(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N; j++) {
                if (person[i].getHeight()<person[j].getHeight() && person[i].getWeight()<person[j].getWeight()){
                    count++;
                }
            }
            rank[i] = count;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(rank[i]+" ");
        }
    }
}
class Person {
    private int weight;
    private int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
