package streams.joining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import streams.commons.Customer;
import streams.commons.CustomerUtil;

import java.util.stream.Collectors;

public class JoiningMain {
    private static final Logger LOG = LoggerFactory.getLogger(JoiningMain.class);

    public static void main(String[] args) {
        LOG.info(
                CustomerUtil.getCustomers().stream()
                        .map(Customer::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "))
        );
    }
}
