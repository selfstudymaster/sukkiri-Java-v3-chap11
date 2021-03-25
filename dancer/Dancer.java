package dancer;

import character.Character;
import matango.Matango;

// code11-09
//public class Dancer extends Character {
//
//    public void dance() {
//        System.out.println(tihs.name + "は情熱的に踊った！");
//    }
//    // attach()をオーバーライドし忘れる
//}
// エラーメッセージ
// java: dancer.Dancerはabstractでなく、character.Character内の
// abstractメソッドattack(matango.Matango)をオーバーライドしません

// code11-10
// ※Dancerクラス内部の未完成部分(親から継承した抽象クラスattack()メソッド)
// ※を無くすために、attack()メソッドをオーバーライドする！

public class Dancer extends Character {

    public void dance() {
        System.out.println(this.name + "は情熱的に踊った！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ！");
        m.hp -= 3;
    }
}