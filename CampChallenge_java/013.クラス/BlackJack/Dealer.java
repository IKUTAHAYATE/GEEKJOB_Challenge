
import java.util.ArrayList;
import java.util.Random;

//ヒューマンクラスを継承する
public class Dealer extends Human {

    //フィールド山札を追加
    private ArrayList<Integer> cards = new ArrayList<Integer>();

    //ディーラークラスで山札を作る
    public Dealer() {

        //1~13のカードをforで4回繰り返す
        for (int n = 0; n < 4; n++) {
            //1~13forで繰り返す
            for (int i = 1; i <= 13; i++) {
                this.cards.add(i);
            }
        }

    }

    //山札からランダムにカードを2枚引き、引いたカードを戻り値にする。
    public ArrayList<Integer> deal() {
        ArrayList<Integer> card = new ArrayList<Integer>();

        //ランダムにカードを2枚引く
        //1枚引く作業
        Random random = new Random();
        Integer index = random.nextInt(this.cards.size());
        card.add(cards.get(index));

        //2枚目を引く作業
        Integer index1 = random.nextInt(this.cards.size());
        card.add(this.cards.get(index1));

        return card;

    }

    //カードを1枚引く処理、引いたカードを戻り値にする。
    public ArrayList<Integer> hit() {
        Random random = new Random();
        Integer index = random.nextInt(this.cards.size());

        ArrayList<Integer> card2 = new ArrayList<>();
        card2.add(this.cards.get(index));

        return card2;
    }

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
    
    return sum ;
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
