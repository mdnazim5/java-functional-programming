package functionalInterface.supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SupplierMain {
    private static final Logger LOG = LoggerFactory.getLogger(SupplierMain.class);

    public static void main(String[] args) {
        final _Supplier supplier = new _Supplier();

        LOG.info(supplier.getDBConnectionUrl.get());
        LOG.info(String.valueOf(supplier.getDBConnectionUrls.get()));
    }

}
