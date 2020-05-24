package streams.partitioning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import streams.commons.CustomerUtil;
import java.util.stream.Collectors;

public class PartitioningMain {
    private static final Logger LOG = LoggerFactory.getLogger(PartitioningMain.class);

    public static void main(String[] args) {
        LOG.info(
                String.valueOf(CustomerUtil.getCustomers().stream()
                .collect(Collectors.partitioningBy(customer -> customer.getAge() > 60))
                .get(true))
        );
    }
}
