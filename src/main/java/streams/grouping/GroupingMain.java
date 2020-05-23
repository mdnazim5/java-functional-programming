package streams.grouping;

import com.google.common.collect.Lists;
import streams.commons.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingMain {
    public static void main(String[] args) {
        System.out.println(
                getCustomers().stream()
                    .collect(Collectors.groupingBy(Customer::getName))
        );

        System.out.println(
                getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.mapping(Customer::getAge, Collectors.toList())))
        );

        System.out.println(
                getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))
        );
    }

    private static List<Customer> getCustomers() {
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

}
