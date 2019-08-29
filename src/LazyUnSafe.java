import java.util.concurrent.*;

/**
 * ClassName LazyUnSafe
 * Package PACKAGE_NAME
 * Description
 *
 * @author gmb1995@outlook.com
 * @date 2019-08-29 21:50
 */
public class LazyUnSafe {

    private static LazyUnSafe lazyUnSafe;

    private LazyUnSafe() {
    }

    public static LazyUnSafe getInstance() {
        if (lazyUnSafe == null) {
            lazyUnSafe = new LazyUnSafe();
        }
        return lazyUnSafe;
    }

}
