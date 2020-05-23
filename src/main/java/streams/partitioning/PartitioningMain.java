package streams.partitioning;

import com.google.common.collect.Lists;
import streams.commons.Customer;
import java.util.List;
import java.util.stream.Collectors;


public class PartitioningMain {
    public static void main(String[] args) {
        System.out.println(
                getCustomers().stream()
                .collect(Collectors.partitioningBy(customer -> customer.getAge() > 60))
                .get(true)
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
