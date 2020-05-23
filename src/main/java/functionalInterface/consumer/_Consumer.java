package functionalInterface.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public Consumer<Customer> greetCustomer = customer ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + customer.getCustomerPhoneNumber());

    public BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "*********"));

}
