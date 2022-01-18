package src_solved.ac_class;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] chess = new String[M];
        int count = 0;
        for (int i = 0; i < M; i++) {
            String s = bf.readLine();
            chess[i] = s;
        }
        char div = 'B';
        if (chess[0].charAt(0) == 'W'){
            div = 'W';
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N-1; j++) {
                if (div == chess[i].charAt(j+1)){
                    count++;
                }
                if (div == 'W')
                    div = (char) (div-21);
                else
                    div = (char) (div+21);
            }
        }
        System.out.println(count);

    }
}
