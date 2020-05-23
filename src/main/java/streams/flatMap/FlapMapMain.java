package streams.flatMap;

import com.google.common.collect.Lists;
import streams.commons.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class FlapMapMain {

    public static void main(String[] args) {
        System.out.println(
                getCustomersList().stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
        );
    }

    private static List<List<Customer>> getCustomersList() {
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
