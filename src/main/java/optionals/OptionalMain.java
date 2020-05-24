package optionals;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class OptionalMain {
    private static final Logger LOG = LoggerFactory.getLogger(OptionalMain.class);

    public static void main(String[] args) {

        final String stringLiteral1 = "string1";
        final String stringLiteral2 = "string2";
        final String defaultStr = "defaultStr";
        final String noValueStr = "No value found";

        Lists.newArrayList(stringLiteral1, null).stream()
                .map(Optional::ofNullable)
                .forEach(element -> element.ifPresentOrElse( LOG::info,
                        () -> LOG.info(noValueStr)));

        Lists.newArrayList(stringLiteral1, null).stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElse(defaultStr))
                .forEach(LOG::info);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(LOG::info);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElseGet(() -> defaultStr))
                .forEach(LOG::info);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.or(() -> Optional.of(defaultStr)))
                .map(Optional::get)
                .forEach(LOG::info);
    }
}
