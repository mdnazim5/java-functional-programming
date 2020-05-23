package callbacks;

public class CallbacksMain {

    public static void main(String[] args) {

        _Callbacks callbacks = new _Callbacks();

        callbacks.consumerCallback(System.out::println);

        callbacks.runnableCallback(() -> System.out.println("Runnable callback"));

    }
}
