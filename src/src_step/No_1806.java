package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken())+1;
        int S = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(("0 "+br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = 0;
        int end = 1;
        int length = 100000;
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        int sum = 0;
        while (start < N){
            //System.out.println(sum);
            sum = arr[end] - arr[start];
            if (sum>=S){
                length = Math.min(length,end-start);
                start++;
            }else {
                if (end != N-1)
                    end++;
                else
                    start++;
            }
        }
        if (length==100000)
            System.out.println(0);
        else
            System.out.println(length);
    }
}
