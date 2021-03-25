package hero;

import character.Character;
import matango.Matango;
// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-03 未来の開発者が開発するコード
//public class Hero extends Character {
//    // Characterクラスの空のattack()メソッドをオーバーライド
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        m.hp -= 10; // 子クラス毎に値を設定できる
//    }
//}

// code11-04 Characterクラスの空のattack()メソッドをオーバーライドし忘れた場合
//public class Hero extends Character {
//    // Characterクラスの空のattack()メソッドをオーバーライドし忘れる
//}

// code11-05 attack()メソッドをatack()と書き損じた場合
//public class Hero extends Character {
//    // Characterクラスの空のattack()メソッドをオーバーライドしたつもりが、atack()に誤字してしまった
//    public void atack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に10ポイントのダメージをあたえた！");
//        m.hp -= 10;
//    }
//}

// code11-10?
public class Hero extends Character {

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp -= 10;
    }
}