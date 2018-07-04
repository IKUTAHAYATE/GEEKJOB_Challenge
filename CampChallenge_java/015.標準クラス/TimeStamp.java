//2016年1月1日のタイムスタンプ値表示

import java.util.Date;
import java.util.Calendar;

public class TimeStamp {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2016, 0, 1, 00, 00, 00);

//        Calendar型をDateに変換
        Date time = c.getTime();

//        タイムスタンプ値を表示
        System.out.println(time.getTime());

    }
}
