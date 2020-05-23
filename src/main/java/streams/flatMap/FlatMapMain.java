package streams.flatMap;

import streams.commons.CustomerUtil;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        System.out.println(
                CustomerUtil.getCustomersList().stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
        );
    }
}
