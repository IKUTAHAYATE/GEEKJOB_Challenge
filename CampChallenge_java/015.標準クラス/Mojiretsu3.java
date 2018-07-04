//文字列型の変数を宣言して，"きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値としてください。 
//宣言した変数について，「I」を「い」に，「U」を「う」に置換した文字列を表示してください。


public class Mojiretsu3 {
    public static void main(String[] args) {
        String a = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        a = a.replace("U","う" );
        a = a.replace("I","い" );
        
        System.out.println(a);
        
    }
}
