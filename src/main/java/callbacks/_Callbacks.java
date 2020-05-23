package callbacks;

import java.util.function.Consumer;

public class _Callbacks {

    public void consumerCallback(Consumer<String> callback) {
        String consumerCallbackStr = "Consumer callback";

        System.out.println("Invoking consumer callback");
        callback.accept(consumerCallbackStr);
    }

    public void runnableCallback(Runnable callback) {
        System.out.println("Invoking runnable callback");
        callback.run();
    }
}
