package callbacks;

import java.util.function.Consumer;

public class Callbacks {

    private static final String INVOKING_CONSUMER_CALLBACK_STR = "Invoking consumer callback";
    private static final String CONSUMER_CALLBACK_STR = "Consumer callback";

    private static final String INVOKING_RUNNABLE_CALLBACK_STR = "Invoking runnable callback";

    public void consumerCallback(final Consumer<String> callback) {
        System.out.println(INVOKING_CONSUMER_CALLBACK_STR);
        callback.accept(CONSUMER_CALLBACK_STR);
    }

    public void runnableCallback(final Runnable callback) {
        System.out.println(INVOKING_RUNNABLE_CALLBACK_STR);
        callback.run();
    }
}
