package functionalInterface.function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class FunctionMain {
    private static final Logger LOG = LoggerFactory.getLogger(FunctionMain.class);

    public static void main(String[] args) {

        final _Function function = new _Function();

        LOG.info(String.valueOf(function.incrementByOne.apply(1)));

        LOG.info(String.valueOf(function.multiplyBy10.apply(2)));

        final Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                function.incrementByOne.andThen(function.multiplyBy10);
        LOG.info(String.valueOf(addBy1AndThenMultiplyBy10.apply(3)));

        LOG.info(String.valueOf(function.incrementByOneAndMultiply.apply(4, 100)));
    }
}
