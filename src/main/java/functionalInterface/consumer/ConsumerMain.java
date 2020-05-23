package functionalInterface.consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        _Consumer consumer = new _Consumer();
        Customer maria = new Customer("Maria", "99999");

        consumer.greetCustomer.accept(maria);

        consumer.greetCustomerV2.accept(maria, true);

        consumer.greetCustomerV2.accept(maria, false);
    }

}
