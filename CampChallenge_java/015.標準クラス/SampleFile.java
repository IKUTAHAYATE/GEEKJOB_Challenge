
//自己紹介の記述されたテキストファイルを作成してください。ファイルの作成は，File クラスなどを利用することによって行ってください。
import java.io.*;

public class SampleFile {

    public static void main(String[] args) {
//try文で始まる
        try {
            //オープン
            File op = new File("test.profile");

            //記述できるインスタンスを生成
            FileWriter fw = new FileWriter(op);
            fw.write("生田颯と申します");
            fw.write("出身地は長崎県です");
            fw.write("年齢は25歳です");
            // クローズ
            fw.close();
//catchを記述            
        } catch (IOException e) {

        }
    }
}
