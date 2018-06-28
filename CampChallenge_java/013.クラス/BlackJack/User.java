import java.util.ArrayList;

public class User extends Human{
    
    //セットカードメソッド（引いたカードを手札にセットするメソッド）
    @Override
    public void setCard(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            myCard.add(num.get(i));
        }
    }

    //オープンメソッド（手札の合計値を計算するメソッド）
    @Override
    public int open() {
        int sum = 0;
        for (int i = 0; i < myCard.size(); i++) {

            //11以上の数字を10に変換する作業
            if (myCard.get(i) >= 10) {
                sum += 10;
            } else {
                sum += myCard.get(i);
            }

        }
        
        return sum;
    }

    //チェックサム（自分の手札の合計値によってまだカードを引くべきか判断するメソッド）
    //カードを引くときは"true"を戻り値として使用、カードを引かないときは"false"を戻り値として使用
    @Override
    public boolean checkSum() {
        if (17 > this.open()) {
            return true;
        } else {
            return false;
        }
    }
}
    

