package functionalInterface.consumer;

public class ConsumerMain {

    public static void main(String[] args) {

        final String customerName = "Maria";
        final String customerPhoneNumber = "+498987878798";

        final _Consumer consumer = new _Consumer();
        final Customer customer = new Customer(customerName, customerPhoneNumber);

        consumer.greetCustomer.accept(customer);

        consumer.greetCustomerV2.accept(customer, true);

        consumer.greetCustomerV2.accept(customer, false);
    }

}
