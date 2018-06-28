
public class BlackJack {
    public static void main(String[] args) {
        
        
        //ディーラーとユーザーをインスタンス生成
        Dealer dealer = new Dealer();
        User user = new User();
        
        
        //ディーラーとプレイヤーに２枚ずつカードを配る
        user.setCard(dealer.deal());
        dealer.setCard(dealer.deal());
        System.out.println("GAME START!!");
        System.out.println("");
        System.out.println("ディーラーが引いたカードは　"+dealer.myCard + " 合計は:"+dealer.open());
        System.out.println("プレイヤーが引いたカードは　"+user.myCard + " 合計は:"+user.open());
        System.out.println("");
        
        
        //プレイヤーの手札が17>myCardの場合1枚引かせる処理
        while (user.checkSum()) {
            user.setCard(dealer.hit());
            System.out.println("プレイヤーがヒットをしました。");
            System.out.println("プレイヤーの手札は　"+user.myCard + " 合計は:"+user.open());
            
            
        }
            //22>myCardの場合スタンドさせる処理
           if (user.open()<22) {
               System.out.println("プレイヤーは"+ +user.open()+"でスタンドしました。");
            
        }
        //22<myCardの場合プレイヤーバーストによりディーラーの勝利
          else if (user.open()>=22) {
                System.out.println("プレイヤーのバースト!!");
                System.out.println("ディーラーの勝利です");
                System.exit(0);
                //↑System.exit(0)強制終了の記述
            }
           
           
           //ディーラーの手札が17>myCardの場合1枚引かせる処理
           while (dealer.checkSum()) {
            dealer.setCard(dealer.hit());
            System.out.println("ディーラーがヒットをしました。");
            System.out.println("ディーラーの手札は　"+dealer.myCard + " 合計は:"+dealer.open());
            
            
        }
            //22>myCardの場合スタンドさせる処理
           if (dealer.open()<22) {
               System.out.println("ディーラーは"+dealer.open()+"でスタンドしました。");
               
               //スタンド同士の優劣で勝敗を記述
                if(dealer.open()<user.open()){
                    System.out.println("");
                    System.out.println("プレイヤーの手札は、"+user.open());
                    System.out.println("ディーラーの手札は、"+dealer.open());
                    System.out.println("のためプレイヤーの勝利です。");
                    
                    }else if (user.open()<dealer.open()){
                    System.out.println("");
                    System.out.println("ディーラーの手札は、"+dealer.open());
                    System.out.println("プレイヤーの手札は、"+user.open());
                    System.out.println("のためディーラーの勝利です。");
                
           }else if (user.open()==dealer.open()) {
            System.out.println("");
                    System.out.println("ディーラーの手札は、"+dealer.open());
                    System.out.println("プレイヤーの手札は、"+user.open());
                    System.out.println("のため引き分けです。");
        }
                    
                    //22<myCardの場合プレイヤーバーストによりディーラーの勝利
           }else if (dealer.open()>=22) {
               System.out.println("");
                System.out.println("ディーラーのバースト!!");
                System.out.println("プレイヤーの勝利です。");
                System.exit(0);
                //↑System.exit(0)強制終了の記述
                    
                
                
        
               
                
                
           
                
            }
           
        }
    
        
        }
        
        