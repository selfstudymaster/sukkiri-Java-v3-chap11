package matango;
// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-01
public class Matango {
    public int hp;
    public final int LEVEL = 10;
    public char suffix;
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
