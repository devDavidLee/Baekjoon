import java.util.Scanner;

public class No_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[100];
        String[] pos = new String[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = "-1";
        }
        String str;
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
           S[i] = ""+str.charAt(i);
        }
        for (char c ='a'; c <= 'z'; c++){
            for (int i = 0; i < str.length(); i++) {
                if (S[i].equals(""+c)){
                    pos[c-97] = i+"";
                    break;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(pos[i]+" ");
        }
    }
}
