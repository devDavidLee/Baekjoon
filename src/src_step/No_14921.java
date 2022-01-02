package src_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_14921 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int index_st = 0;
        int index_end = N-1;
        int[] num = new int[N];
        String[] str_num = bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(str_num[i]);
        }
        Arrays.sort(num);
        int sum = num[0]+num[N-1];
        while (index_st != index_end){
            if (Math.abs(sum)>=Math.abs(num[index_st]+num[index_end])){
                sum = num[index_st]+num[index_end];
            }
            if ((num[index_st]+num[index_end])>0){
                index_end--;
            }
            else if((num[index_st]+num[index_end])<0){
                index_st++;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
    }
}
