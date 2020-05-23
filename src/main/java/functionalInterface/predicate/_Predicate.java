package functionalInterface.predicate;

import java.util.function.Predicate;

public class _Predicate {

    static final Integer PHONE_LENGTH_VALIDATOR = 13;
    static final String GERMAN_PHONE_NUMBER_VALIDATOR = "+49";
    static final String GERMAN_PREPAID_PHONE_NUMBER_VALIDATOR = "+4917";

    public final Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.length() == PHONE_LENGTH_VALIDATOR;

    public final Predicate<String> isGermanNumber = phoneNumber ->
            phoneNumber.startsWith(GERMAN_PHONE_NUMBER_VALIDATOR);

    public final Predicate<String> isPrepaid = phoneNumber ->
            phoneNumber.startsWith(GERMAN_PREPAID_PHONE_NUMBER_VALIDATOR);
}
