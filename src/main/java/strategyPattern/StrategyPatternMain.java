package strategyPattern;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;

public class StrategyPatternMain {

    public static void main(String[] args) {
        final List<Integer> numbers = Lists.newArrayList(1,2,3,4,5,6,7,8,9);

        final Integer doubleSumAllValues = sumDoubleValues(numbers, doubleAllElementsSumStrategy);
        System.out.println(doubleSumAllValues);

        final Integer doubleSumEvenValues = sumDoubleValues(numbers, doubleEvenElementsSumStrategy);
        System.out.println(doubleSumEvenValues);

        final Integer doubleSumOddValues = sumDoubleValues(numbers, doubleOddElementsSumStrategy);
        System.out.println(doubleSumOddValues);
    }

    public static Integer sumDoubleValues(final List<Integer> numbers, final Function<Integer, Integer> strategy) {
        return numbers.stream()
                .map(strategy)
                .reduce(0, Integer::sum);
    }

    public static final Function<Integer, Integer> doubleAllElementsSumStrategy = number -> number * 2;

    public static final Function<Integer, Integer> doubleEvenElementsSumStrategy = number -> (number%2 == 0) ? number *2 : 0;

    public static final Function<Integer, Integer> doubleOddElementsSumStrategy = number -> (number%2 != 0) ? number *2 : 0;
}
