package combinatorPatttern;

import java.time.LocalDate;

import static combinatorPatttern.CustomerRegistrationValidator.*;

public class CombinatorPatternMain {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+498987878798",
                LocalDate.of(2015, 1,1)
        );
        ValidationResult result = isEmailValid()
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
