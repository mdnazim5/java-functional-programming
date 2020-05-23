package functionalInterface.function;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {

        _Function function = new _Function();

        System.out.println(function.incrementByOne.apply(1));

        System.out.println(function.multiplyBy10.apply(2));

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                function.incrementByOne.andThen(function.multiplyBy10);
        System.out.println(addBy1AndThenMultiplyBy10.apply(3));

        System.out.println(function.incrementByOneAndMultiply.apply(4, 100));
    }
}
