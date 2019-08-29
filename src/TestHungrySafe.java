import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName Test
 * Package PACKAGE_NAME
 * Description
 *
 * @author gmb1995@outlook.com
 * @date 2019-08-29 22:26
 */
public class TestHungrySafe {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> System.out.println("HungrySafe.getInstance() = " + HungrySafe.getInstance()));
        }
        executor.shutdown();

        /*for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(LazyUnSafe.getInstance());
                }
            }).start();
        }*/
    }
}
