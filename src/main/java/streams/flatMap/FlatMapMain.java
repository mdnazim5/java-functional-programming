package streams.flatMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import streams.commons.CustomerUtil;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    private static final Logger LOG = LoggerFactory.getLogger(FlatMapMain.class);

    public static void main(String[] args) {
        LOG.info(
                String.valueOf(CustomerUtil.getCustomersList().stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList()))
        );
    }
}
