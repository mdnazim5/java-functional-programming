package combinatorPatttern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorPatttern.CustomerRegistrationValidator.*;
import static combinatorPatttern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains(EMAIL_VALIDATION_STR) ?
                    SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith(PHONE_VALIDATION_STR) ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer ->
                Period.between(customer.getDob(), LocalDate.now()).getYears() > AGE_VALIDATOR ?
                        SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (final CustomerRegistrationValidator other) {
        return customer -> {
            final ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }

    String EMAIL_VALIDATION_STR = "@";
    String PHONE_VALIDATION_STR = "+49";
    Integer AGE_VALIDATOR = 16;
}
