package main;
import character.Character;
import dancer.Dancer;
import hero.Hero;
import matango.Matango;

// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-04 Heroクラスでattack()オーバーライドし忘れると、メソッドは呼び出せるが何も起きない
//public class Main {
//    public static void main(String[] args) {
//        Hero h = new Hero();
//        Matango m = new Matango();
//        h.attack(m); // 呼び出せるが何も起きず、エラーも出ない
//    }
//}

// code11-06 意図せず親クラス(Character)がnewして利用されてしまう
//public class Main {
//    public static void main(String[] args) {
//        Character c = new Character(); // Hero()ではなくCharacterをnewしてしまう
//        Matango m = new Matango();
//        c.attack(m); // 呼び出せるがオーバーライドされてもいない空のメソッドなので何も起きず、エラーも出ない
//    }
//}

// code11-08
//public class Main {
//    public static void main(String[] args) {
//        Character c = new Character(); // Hero()ではなく抽象クラスのCharacterをnewしてもエラーになる
//        // エラーメッセージ
//        // java: character.Characterはabstractです。インスタンスを生成することはできません
//        Matango m = new Matango();
//        c.attack(m);
//    }
//}

// code11-10 のDancerクラスの確認用にnew Dancer()してみた
public class Main {
    public static void main(String[] args) {
        Matango m = new Matango();
        Dancer d = new Dancer();
        d.name = "踊り子";
        d.dance();
        d.attack(m);
    }
}
