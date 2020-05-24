package callbacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class Callbacks {

    private static final Logger LOG = LoggerFactory.getLogger(Callbacks.class);

    private static final String INVOKING_CONSUMER_CALLBACK_STR = "Invoking consumer callback";
    private static final String CONSUMER_CALLBACK_STR = "Consumer callback";

    private static final String INVOKING_RUNNABLE_CALLBACK_STR = "Invoking runnable callback";

    public void consumerCallback(final Consumer<String> callback) {
        LOG.info(INVOKING_CONSUMER_CALLBACK_STR);
        callback.accept(CONSUMER_CALLBACK_STR);
    }

    public void runnableCallback(final Runnable callback) {
        LOG.info(INVOKING_RUNNABLE_CALLBACK_STR);
        callback.run();
    }
}
