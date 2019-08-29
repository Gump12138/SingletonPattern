/**
 * ClassName HungrySafe
 * Package PACKAGE_NAME
 * Description
 *
 * @author gmb1995@outlook.com
 * @date 2019-08-29 22:48
 */
public class HungrySafe {
    private static HungrySafe hungrySafe = new HungrySafe();

    private HungrySafe() {
    }

    public static HungrySafe getInstance() {
        return hungrySafe;
    }
}
