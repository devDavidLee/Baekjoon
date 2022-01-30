package src_step;

import java.io.*;
import java.util.Arrays;

public class No_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] arr_N = Arrays.stream((br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr_M = Arrays.stream((br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[N+M];
        System.arraycopy(arr_N,0,arr,0,arr_N.length);
        System.arraycopy(arr_M,0,arr,arr_N.length,arr_M.length);
        Arrays.sort(arr);
        for (int i:arr){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }
}