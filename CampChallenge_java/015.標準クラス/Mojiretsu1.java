
//自分の氏名について，バイト数と文字数を取得してください。また，それぞれの値を画面に表示してください.
public class Mojiretsu1 {

    public static void main(String[] args) {
        String name = "生田颯";
//        文字数取得
        System.out.println(name.length());
//        バイト数取得
        System.out.println(name.getBytes().length);
    }

}
