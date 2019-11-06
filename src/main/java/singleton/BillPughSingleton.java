package singleton;

/**
 * Created by tuqi on 2018/8/20.
 */
public class BillPughSingleton {

    private static class BillPughSingletonHelper {
         private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.INSTANCE;
    }
}
