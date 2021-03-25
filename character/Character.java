package character;

import matango.Matango;
// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)
// code11-01

//public class Character {
//    String name;
//    int hp;
//    // 逃げる
//    public void run() {
//        System.out.println(this.name + "は逃げ出した!");
//    }
//    // 戦う (詳細未定メソッド)
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        m.hp -= ??; // キャラクターによって値が変わってくるため、値を決めようがない
//        System.out.println("敵に??ポイントのダメージをあたえた！");
//    }
//}

// code11-02 attack()メソッドの中身を空にしておく
//public class Character {
//    public String name;
//    public int hp;
//    // 逃げる
//    public void run() {
//        System.out.println(this.name + "は逃げ出した!");
//    }
//    // 戦う (詳細未定メソッド)
//    public void attack(Matango m) {
//        // 値を決められないためあえて空のままにしておき、子クラスでオーバーライドして用いる
//    }
//}

// code11-07 抽象メソッド:詳細未定メソッドに明示的にabstractをつける
// code11-08 抽象メソッドを含むクラスは必ず abstract 付きのクラスにしなければならない
public abstract class Character {
    public String name;
    public int hp;
    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した!");
    }
    // 戦う (詳細未定メソッドにabstractをつけることで、「宣言すべきメソッドだが内部の処理は記載しないこと」を明示する)
    public abstract void attack(Matango m);
}