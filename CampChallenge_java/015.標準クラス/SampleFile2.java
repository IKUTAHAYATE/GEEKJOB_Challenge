
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class SampleFile2 {
 
    public static void main(String[] args) {
        try {
            //Fileクラスに読み込むファイルを指定する
            File file = new File("test.profile");
            
            //ファイルが存在するか確認する
            
                
                //FileReaderクラスのオブジェクトを生成する
                FileReader filereader = new FileReader(file);
                
                //filereaderクラスのreadメソッドでファイルを1文字ずつ読み込む
                int data;
                while((data = filereader.read()) != -1) {
                    System.out.print((char) data);
                }
                
                //ファイルクローズ
                filereader.close();
                
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}