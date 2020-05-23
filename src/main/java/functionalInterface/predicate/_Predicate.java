package functionalInterface.predicate;

import java.util.function.Predicate;

public class _Predicate {
    public Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.length() == 13;

    public Predicate<String> isGermanNumber = phoneNumber ->
            phoneNumber.startsWith("+49");

    public Predicate<String> isPrepaid = phoneNumber ->
            phoneNumber.startsWith("+4917");
}
