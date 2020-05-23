package functionalInterface.predicate;

import com.google.common.collect.Lists;

public class PredicateMain {
    public static void main(String[] args) {

        _Predicate predicate = new _Predicate();

        System.out.println(predicate.isPhoneNumberValid.test("+497000000000"));
        System.out.println(predicate.isGermanNumber.test("+497000000000"));
        System.out.println(predicate.isPrepaid.test("+491709877300"));

        System.out.println(predicate.isPhoneNumberValid.test("+49700000000"));
        System.out.println(predicate.isGermanNumber.test("+40700000000"));
        System.out.println(predicate.isPrepaid.test("+499009877300"));

        Lists.newArrayList("+497000000001", "+49880000002", "+491709877333").stream()
                .filter(predicate.isPhoneNumberValid)
                .forEach(System.out::println);

        Lists.newArrayList("+497000000004", "+49777000005", "+491709877306").stream()
                .filter(predicate.isPhoneNumberValid.and(predicate.isGermanNumber).and(predicate.isPrepaid))
                .forEach(System.out::println);

        Lists.newArrayList("+497000000009", "+49710000007", "+4019097307").stream()
                .filter(predicate.isPhoneNumberValid.or(predicate.isGermanNumber).or(predicate.isPrepaid))
                .forEach(System.out::println);

    }
}
