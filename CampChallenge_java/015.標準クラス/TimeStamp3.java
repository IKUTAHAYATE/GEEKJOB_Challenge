//2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

import java.util.Date;
import java.util.Calendar;

public class TimeStamp3 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Calendar d = Calendar.getInstance();
        c.set(2015, 0, 1, 00, 00, 00);
        d.set(2015, 12, 31, 23, 59, 59);

//        Calendar型をDateに変換
        Date a = c.getTime();
        Date b = d.getTime();

//        タイムスタンプ値を表示しその差の値を表示する
        System.out.println(b.getTime() - a.getTime());

    }
}
