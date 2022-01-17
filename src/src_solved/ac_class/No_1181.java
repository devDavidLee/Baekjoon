package src_solved.ac_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class No_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!list.contains(str)){
                list.add(str);
            } else {
                continue;
            }
        }
        String[] arr = list.toArray(new String[list.size()]);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(arr[i]);
        }
    }
}
