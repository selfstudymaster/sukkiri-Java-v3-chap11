package fool;

import human.Human;
import character.Character;
import matango.Matango;
// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-17 extendsとimplementsを両方使ったクラス定義
// アクセス修飾子 class クラス名 extends 親クラス implements 親インターフェース1, 親インターフェース2
public class Fool extends Character implements Human {

    // Characterクラスからフィールドやメソッドを継承(extends)
    // Characterから継承した抽象メソッドattackを実装(implements)
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わずに遊んでいる");
    }
    // さらにHumanから継承した4つの抽象メソッドを実装(implements)
    public void talk() {/* 省略 */}
    public void watch() {/* 省略 */}
    public void hear() {/* 省略 */}
    // この実装はHumanインターフェースのrun()かCharacterクラスのrun()か？？？
    public void run() {/* 省略 */}
}
// クラスとインターフェースの階層

// インターフェースCreature 抽象メソッド:run()
// インターフェースHuman 抽象メソッド:talk(),watch(),hear(), Creatureから継承した抽象メソッド:run()
// クラスCharacter 抽象メソッド:run(), attack()
// クラスFool インターフェースHumanとクラスCharacterを継承 抽象メソッドtalk(),watch(),hear(), run()