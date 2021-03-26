package cleaningservice;

import shirt.Shirt;
import towl.Towl;
import coat.Coat;

// 第3版chap11(第2版chap12):高度な継承
// 第3版code11(第2版list12)

// code11-14
public interface CleaningService {
    // 抽象メソッド
    Shirt washShirt(Shirt s);
    Towl washTowl(Towl t);
    Coat washCoat(Coat c);
}
