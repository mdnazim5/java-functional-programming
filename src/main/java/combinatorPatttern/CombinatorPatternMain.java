package combinatorPatttern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import static combinatorPatttern.CustomerRegistrationValidator.*;

public class CombinatorPatternMain {
    private static final Logger LOG = LoggerFactory.getLogger(CombinatorPatternMain.class);

    public static void main(String[] args) {
        final String customerName = "Alice";
        final String customerEmail = "alice@gmail.com";
        final String customerPhoneNumber = "+498987878798";
        final LocalDate customerDob = LocalDate.of(2010,1,1);

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
            LOG.error(result.name());
        } else {
            LOG.info(result.toString());
        }
    }
}
