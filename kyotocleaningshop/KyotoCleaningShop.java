package kyotocleaningshop;

import cleaningservice.CleaningService;
import shirt.Shirt;
import towl.Towl;
import coat.Coat;

// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-15 CleaningServiceインターフェースを実装してKyotoCleaningShopを作る
// インターフェースを継承して子クラスを定義する際は implements を使う。
public class KyotoCleaningShop implements CleaningService {
    // フィールドを定義
    private String owneName; // オーナー名
    private String address; // 住所
    private String phone; // 電話番号

    // インターフェースの抽象メソッドをオーバーライドして実装
    // シャツを洗う
    public Shirt washShirt(Shirt s) {
        return s;
    }
    // タオルを洗う
    public Towl washTowl(Towl t) {
        return t;
    }
    // コートを洗う
    public Coat washCoat(Coat c) {
        return c;
    }

}
