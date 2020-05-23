package streams.reduce;

import streams.commons.Customer;
import streams.commons.CustomerUtil;

public class ReduceMain {

    public static void main(String[] args) {
        System.out.println(
                CustomerUtil.getCustomers().stream()
                        .mapToInt(Customer::getAge)
                        .reduce(0, Integer::sum)
        );
    }
}
