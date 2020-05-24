package callbacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallbacksMain {
    private static final Logger LOG = LoggerFactory.getLogger(CallbacksMain.class);

    private static final String RUNNABLE_CALLBACK_STR = "Runnable callback";

    public static void main(String[] args) {

        final Callbacks callbacks = new Callbacks();

        callbacks.consumerCallback(LOG::info);

        callbacks.runnableCallback(() -> LOG.info(RUNNABLE_CALLBACK_STR));
    }
}
