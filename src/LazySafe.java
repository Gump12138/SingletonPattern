/**
 * ClassName LazySafe
 * Package PACKAGE_NAME
 * Description
 *
 * @author gmb1995@outlook.com
 * @date 2019-08-29 22:40
 */
public class LazySafe {
    private volatile static LazySafe lazySafe;

    private LazySafe() {
    }

    public static LazySafe getInstance() {
        if (lazySafe == null) {
            synchronized (LazySafe.class) {
                if (lazySafe == null) {
                    lazySafe = new LazySafe();
                }
            }
        }
        return lazySafe;
    }
}
