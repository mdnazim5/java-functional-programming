package functionalInterface.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    private static final String GREETING_TEMPLATE = "Hello %s. Thanks for registering your phone number %s.";
    private static final String HIDDEN_PHONE_NR_STR = "*********";

    public final Consumer<Customer> greetCustomer = customer ->
            System.out.println(String.format(GREETING_TEMPLATE, customer.getCustomerName(), customer.getCustomerPhoneNumber()));

    public final BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println(String.format(GREETING_TEMPLATE, customer.getCustomerName(), (showPhoneNumber ? customer.getCustomerPhoneNumber() : HIDDEN_PHONE_NR_STR)));

}
