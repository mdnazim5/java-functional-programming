package streams.grouping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import streams.commons.Customer;
import streams.commons.CustomerUtil;

import java.util.stream.Collectors;

public class GroupingMain {
    private static final Logger LOG = LoggerFactory.getLogger(GroupingMain.class);

    public static void main(String[] args) {
        LOG.info(
                String.valueOf(CustomerUtil.getCustomers().stream()
                    .collect(Collectors.groupingBy(Customer::getName)))
        );

        LOG.info(
                String.valueOf(CustomerUtil.getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.mapping(Customer::getAge, Collectors.toList()))))
        );

        LOG.info(
                String.valueOf(CustomerUtil.getCustomers().stream()
                        .collect(Collectors
                                .groupingBy(Customer::getName, Collectors.collectingAndThen(Collectors.counting(), Long::intValue))))
        );
    }
}
