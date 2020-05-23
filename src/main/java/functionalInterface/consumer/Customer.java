package functionalInterface.consumer;

public class Customer {
    private final String customerName;
    private final String customerPhoneNumber;

    Customer(final String customerName, final String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}
