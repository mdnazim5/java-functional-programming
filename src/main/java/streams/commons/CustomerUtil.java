package streams.commons;

import com.google.common.collect.Lists;

import java.util.List;

public final class CustomerUtil {
    private CustomerUtil() {}

    public static List<Customer> getCustomers() {
        return Lists.newArrayList(
                new Customer("Sara", 20),
                new Customer("Sara", 22),
                new Customer("Bob", 20),
                new Customer("Paula", 32),
                new Customer("Paul", 32),
                new Customer("Jack", 2),
                new Customer("Jack", 72),
                new Customer("Jill", 12)
        );
    }

    public static List<List<Customer>> getCustomersList() {
        return Lists.newArrayList(
                Lists.newArrayList(
                        new Customer("Sara", 20),
                        new Customer("Sara", 22),
                        new Customer("Bob", 20)
                ),
                Lists.newArrayList(
                        new Customer("Paula", 32),
                        new Customer("Paul", 32),
                        new Customer("Jack", 2)
                ),
                Lists.newArrayList(
                        new Customer("Jack", 72),
                        new Customer("Jill", 12)
                )
        );
    }
}
