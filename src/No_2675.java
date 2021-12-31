import java.util.Scanner;

public class No_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[][] array = new String[T][20];
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String str = sc.nextLine();
            str = str.trim();
            for (int j = 0; j < str.length(); j++) {
                String s = ""+str.charAt(j);
                array[i][j] = s.repeat(R);
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 20; j++) {
                if (array[i][j]!=null){
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
