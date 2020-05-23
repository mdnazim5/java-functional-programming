package combinatorPatttern;

import java.time.LocalDate;

import static combinatorPatttern.CustomerRegistrationValidator.*;

public class CombinatorPatternMain {

    public static void main(String[] args) {
        final String customerName = "Alice";
        final String customerEmail = "alice@gmail.com";
        final String customerPhoneNumber = "+498987878798";
        final LocalDate customerDob = LocalDate.of(2015,1,1);

        final Customer customer = new Customer(
                customerName,
                customerEmail,
                customerPhoneNumber,
                customerDob
        );
        final ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        } else {
            System.out.println(result);
        }
    }
}
