       


    class Class1 {
    public static void main(String[] args) {
       
        // Birdクラスのインスタンス生成
        Bird tori = new Bird();

        // 鳥インスタンスのsetBirdsメソッドを利用
        tori.setBirds("ハヤテ",10);
    }

         }
        
    
class Bird {
    

// フィールドの宣言
    public String name = "ハヤテ";
    public int num = 10;

    // メソッドの宣言
    public void setBirds(String n, int i) {
      
        // 引数をフィールドへ設定
        this.name =n ;
        this.num = i ;
        
        //出力
        System.out.println("鳥の名前は"+name+"彼のが引き連れている集団の数は"+num);
    
    }
    
    
}
       
    
