package streams.partitioning;

import streams.commons.CustomerUtil;
import java.util.stream.Collectors;

public class PartitioningMain {
    public static void main(String[] args) {
        System.out.println(
                CustomerUtil.getCustomers().stream()
                .collect(Collectors.partitioningBy(customer -> customer.getAge() > 60))
                .get(true)
        );
    }
}
