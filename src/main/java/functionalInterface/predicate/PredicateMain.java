package functionalInterface.predicate;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PredicateMain {
    private static final Logger LOG = LoggerFactory.getLogger(PredicateMain.class);

    public static void main(String[] args) {

        final String phoneNumber1 = "+497000000000";
        final String phoneNumber2 = "+491709877300";
        final String phoneNumber3 = "+40700000000";
        final String phoneNumber4 = "+499009877300";

        final _Predicate predicate = new _Predicate();

        LOG.info(String.valueOf(predicate.isPhoneNumberValid.test(phoneNumber1)));
        LOG.info(String.valueOf(predicate.isGermanNumber.test(phoneNumber1)));
        LOG.info(String.valueOf(predicate.isPrepaid.test(phoneNumber2)));

        LOG.info(String.valueOf(predicate.isPhoneNumberValid.test(phoneNumber1)));
        LOG.info(String.valueOf(predicate.isGermanNumber.test(phoneNumber3)));
        LOG.info(String.valueOf(predicate.isPrepaid.test(phoneNumber4)));

        final String phoneNumber5 = "+497000000001";
        final String phoneNumber6 = "+49880000002";
        final String phoneNumber7 = "+491709877333";

        Lists.newArrayList(phoneNumber5, phoneNumber6, phoneNumber7).stream()
                .filter(predicate.isPhoneNumberValid)
                .forEach(LOG::info);

        final String phoneNumber8 = "+497000000004";
        final String phoneNumber9 = "+49777000005";
        final String phoneNumber10 = "+491709877306";

        Lists.newArrayList(phoneNumber8, phoneNumber9, phoneNumber10).stream()
                .filter(predicate.isPhoneNumberValid.and(predicate.isGermanNumber).and(predicate.isPrepaid))
                .forEach(LOG::info);

        final String phoneNumber11 = "+497000000009";
        final String phoneNumber12 = "+49710000007";
        final String phoneNumber13 = "+4019097307";

        Lists.newArrayList(phoneNumber11, phoneNumber12, phoneNumber13).stream()
                .filter(predicate.isPhoneNumberValid.or(predicate.isGermanNumber).or(predicate.isPrepaid))
                .forEach(LOG::info);

    }
}
