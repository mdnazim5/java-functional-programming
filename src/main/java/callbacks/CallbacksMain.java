package callbacks;

public class CallbacksMain {

    private static final String RUNNABLE_CALLBACK_STR = "Runnable callback";

    public static void main(String[] args) {

        final Callbacks callbacks = new Callbacks();

        callbacks.consumerCallback(System.out::println);

        callbacks.runnableCallback(() -> System.out.println(RUNNABLE_CALLBACK_STR));

    }
}
