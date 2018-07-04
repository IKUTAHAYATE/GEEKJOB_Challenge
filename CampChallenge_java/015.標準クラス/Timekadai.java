
import java.util.Calendar;

public class Timekadai {

    public static void main(String[] args) {

//        1998/4/21 1時23分45秒を表示
        Calendar c = Calendar.getInstance();
        c.set(1988, 4, 21, 1, 23, 45);
        System.out.print(c.get(c.YEAR) + "年");
        System.out.print(c.get(c.MONTH) + "月");
        System.out.print(c.get(c.DAY_OF_MONTH) + "日");
        System.out.print(c.get(c.HOUR_OF_DAY) + "時");
        System.out.print(c.get(c.MINUTE) + "分");
        System.out.print(c.get(c.SECOND) + "秒");

    }

}
