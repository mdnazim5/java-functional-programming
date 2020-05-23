package functionalInterface.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public final Function<Integer, Integer> incrementByOne =
            number -> number + 1;

    public final Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    public final BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
