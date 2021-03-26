package human;

import creature.Creature;

// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-16
public interface Human extends Creature{
    void talk();
    void watch();
    void hear();
    // 親インターフェースCreatureからrun()メソッドを継承しているが、
    // run()メソッドをオーバーライドして内容を確定させるわけではないので
    // implementsではなくextendsで継承する
}
