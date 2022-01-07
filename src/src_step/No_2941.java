package src_step;

import java.util.Scanner;

public class No_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str_bf = new StringBuffer();
        String str = sc.nextLine();
        str_bf.append(str);
        int count = 0;
        String[] c_alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int index = -1;
        for (int k = 0; k < 100; k++) {
            b:
            for (int i = 0; i < 8; i++) {
                if (str.contains(c_alphabet[i])){
                    index = str.indexOf(c_alphabet[i]);
                    for (int j = index; j < c_alphabet[i].length()+index; j++) {
                        //System.out.println(j);
                        str_bf.replace(j,j+1," ");
                        //System.out.println(str_bf);
                    }
                    str = String.valueOf(str_bf);
                    count++;
                    i = 0;
                    continue b;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
