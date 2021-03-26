package creature;

// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-11 抽象クラスCreature
//public abstract class Creature {
//    public abstract void run();
//}

// code11-12 インターフェース Creature
// インターフェースの特徴 1:全てのメソッドは抽象メソッド 2:基本的にフィールドを1つも持たない
//public interface Creature {
//    public abstract void run();
//}

// code11-13 インターフェース Creature
// インターフェースとして宣言されたメソッドは自動的に public かつ abstract になる(省略可)
public interface Creature {
    // インターフェース内のメソッドは自動的に public abstract になる
    void run();
    // インターフェースは基本的にフィールドを持たないが、「public static finalがついたフィールド(定数)」
    // だけは宣言が許される。public static finalは省略可能(自動的に補われる)。
    // double PI = 3.141592; // public static final double PI = 3.141592;を指す
}
