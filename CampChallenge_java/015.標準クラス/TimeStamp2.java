//2016年10月4日10時のタイムスタンプ値表示・日付を表示

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TimeStamp2 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 4, 10, 00, 00);

//        Calendar型をDateに変換
        Date time = c.getTime();
//        タイムスタンプ値を表示
        System.out.println(time.getTime());

//        日付を自由なフォーマットに変換
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        フォーマットに沿って日付を表示
        System.out.println(sdf.format(time));

    }
}
