package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringBuffer S = new StringBuffer(br.readLine());
        String Pn = "";
        int count = 0;
        for (int i = 1; i <= 2*N+1; i++) {
            if (i%2==1){
                Pn += "I";
            }else if (i%2==0){
                Pn += "O";
            }
        }
        for (int i = 0; i < M; i++) {
            if (S.indexOf(Pn)>-1){
                S.delete(0,S.indexOf(Pn)+1);
                count++;
            }
        }
        System.out.println(count);
    }
}
