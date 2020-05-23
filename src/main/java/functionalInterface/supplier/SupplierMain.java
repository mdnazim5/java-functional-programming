package functionalInterface.supplier;

public class SupplierMain {
    public static void main(String[] args) {
        final _Supplier supplier = new _Supplier();

        System.out.println(supplier.getDBConnectionUrl.get());
        System.out.println(supplier.getDBConnectionUrls.get());
    }

}
