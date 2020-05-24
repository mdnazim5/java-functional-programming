package streams.reduce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import streams.commons.Customer;
import streams.commons.CustomerUtil;

public class ReduceMain {
    private static final Logger LOG = LoggerFactory.getLogger(ReduceMain.class);

    public static void main(String[] args) {
        LOG.info(
                String.valueOf(CustomerUtil.getCustomers().stream()
                        .mapToInt(Customer::getAge)
                        .reduce(0, Integer::sum))
        );
    }
}
