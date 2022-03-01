package src_step;

import java.text.SimpleDateFormat;
import java.util.Date;

public class No_16170 {
    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy\nMM\ndd");
        Date now = new Date();
        String nowt = sd.format(now);
        System.out.println(nowt);
    }
}
