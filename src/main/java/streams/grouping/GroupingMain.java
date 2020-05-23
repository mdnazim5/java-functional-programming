package streams.grouping;

import streams.commons.Customer;
import streams.commons.CustomerUtil;
import java.util.stream.Collectors;

public class GroupingMain {
    public static void main(String[] args) {
        System.out.println(
                CustomerUtil.getCustomers().stream()
                    .collect(Collectors.groupingBy(Customer::getName))
        );

        System.out.println(
                CustomerUtil.getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.mapping(Customer::getAge, Collectors.toList())))
        );

        System.out.println(
                CustomerUtil.getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))
        );
    }
}
