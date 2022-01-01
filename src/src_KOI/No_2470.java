package src_KOI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int index_st = 0;
        int index_end = N-1;
        int[] num = new int[N];
        String[] str_num = bf.readLine().split(" ");
        int[] result = new int[2];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(str_num[i]);
        }
        Arrays.sort(num);
        int sum = num[0]+num[N-1];
        while (index_st != index_end){
            if (Math.abs(sum)>=Math.abs(num[index_st]+num[index_end])){
                sum = num[index_st]+num[index_end];
                result[0] = num[index_st];
                result[1] = num[index_end];
            }
            if ((num[index_st]+num[index_end])>0){
                index_end--;
            }
            else if((num[index_st]+num[index_end])<0){
                index_st++;
            }
            else{
                result[0] = num[index_st];
                result[1] = num[index_end];
                break;
            }
        }
        if (result[0]<result[1])
            System.out.println(result[0]+" "+result[1]);
        else
            System.out.println(result[1]+" "+result[0]);
    }
}
