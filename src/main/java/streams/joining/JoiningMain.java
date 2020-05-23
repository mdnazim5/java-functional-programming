package streams.joining;

import streams.commons.Customer;
import streams.commons.CustomerUtil;
import java.util.stream.Collectors;

public class JoiningMain {
    public static void main(String[] args) {
        System.out.println(
                CustomerUtil.getCustomers().stream()
                        .map(Customer::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "))
        );
    }
}
