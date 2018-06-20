/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author triveransaruku
 */
public class kadaiclass1 {
    public static void main(String[] args) {
       
        // Birdクラスのインスタンス生成
        Bird tori = new Bird();

        // 鳥インスタンスのsetBirdsメソッドを利用
        tori.setBirds("ハヤテ",10);
    }
}
    
class Bird {
    
// フィールドの宣言
    public String name = "";
    public int num = 5;

    // メソッドの宣言
    public void setBirds(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.num *= a;
        
        //出力
        System.out.println("鳥の名前は"+name+"彼のが引き連れている集団の数は"+num);
    }
    
}
        
       
    
