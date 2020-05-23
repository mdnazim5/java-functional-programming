package strategyPattern;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;

public class StrategyPatternMain {

    public static void main(String[] args) {
        List<Integer> numbers = Lists.newArrayList(1,2,3,4,5,6,7,8,9);

        Integer sumAllValues = sumDoubleValues(numbers, doubleAllElementsSumStrategy);
        System.out.println(sumAllValues);

        Integer sumEvenValues = sumDoubleValues(numbers, doubleEvenElementsSumStrategy);
        System.out.println(sumEvenValues);

        Integer sumOddValues = sumDoubleValues(numbers, doubleOddElementsSumStrategy);
        System.out.println(sumOddValues);
    }

    public static Integer sumDoubleValues(List<Integer> numbers, Function<Integer, Integer> strategy) {
        return numbers.stream()
                .map(strategy)
                .reduce(0, Integer::sum);
    }

    public static Function<Integer, Integer> doubleAllElementsSumStrategy = number -> number * 2;

    public static Function<Integer, Integer> doubleEvenElementsSumStrategy = number -> (number%2 == 0) ? number *2 : 0;

    public static Function<Integer, Integer> doubleOddElementsSumStrategy = number -> (number%2 != 0) ? number *2 : 0;
}
