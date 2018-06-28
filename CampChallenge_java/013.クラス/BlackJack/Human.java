
import java.util.ArrayList;

abstract public class Human {

    //フィールドの追加
    ArrayList<Integer> myCard = new ArrayList<>();

    //オープンメソッド（手札の合計値を計算するメソッド）
    abstract public int open();

    //セットカードメソッド（引いたカードを手札にセットするメソッド）
    abstract public void setCard(ArrayList<Integer> num);
        
    //チェックサム（自分の手札の合計値によってまだカードを引くべきか判断するメソッド）
    //カードを引くときは"true"を戻り値として使用、カードを引かないときは"false"を戻り値として使用
    abstract public boolean checkSum();
    
    
}

