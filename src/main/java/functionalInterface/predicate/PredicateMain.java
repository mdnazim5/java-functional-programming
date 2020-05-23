package functionalInterface.predicate;

import com.google.common.collect.Lists;

public class PredicateMain {
    public static void main(String[] args) {

        final String phoneNumber1 = "+497000000000";
        final String phoneNumber2 = "+491709877300";
        final String phoneNumber3 = "+40700000000";
        final String phoneNumber4 = "+499009877300";

        final _Predicate predicate = new _Predicate();

        System.out.println(predicate.isPhoneNumberValid.test(phoneNumber1));
        System.out.println(predicate.isGermanNumber.test(phoneNumber1));
        System.out.println(predicate.isPrepaid.test(phoneNumber2));

        System.out.println(predicate.isPhoneNumberValid.test(phoneNumber1));
        System.out.println(predicate.isGermanNumber.test(phoneNumber3));
        System.out.println(predicate.isPrepaid.test(phoneNumber4));

        final String phoneNumber5 = "+497000000001";
        final String phoneNumber6 = "+49880000002";
        final String phoneNumber7 = "+491709877333";

        Lists.newArrayList(phoneNumber5, phoneNumber6, phoneNumber7).stream()
                .filter(predicate.isPhoneNumberValid)
                .forEach(System.out::println);

        final String phoneNumber8 = "+497000000004";
        final String phoneNumber9 = "+49777000005";
        final String phoneNumber10 = "+491709877306";

        Lists.newArrayList(phoneNumber8, phoneNumber9, phoneNumber10).stream()
                .filter(predicate.isPhoneNumberValid.and(predicate.isGermanNumber).and(predicate.isPrepaid))
                .forEach(System.out::println);

        final String phoneNumber11 = "+497000000009";
        final String phoneNumber12 = "+49710000007";
        final String phoneNumber13 = "+4019097307";

        Lists.newArrayList(phoneNumber11, phoneNumber12, phoneNumber13).stream()
                .filter(predicate.isPhoneNumberValid.or(predicate.isGermanNumber).or(predicate.isPrepaid))
                .forEach(System.out::println);

    }
}
