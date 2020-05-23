package optionals;

import com.google.common.collect.Lists;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        final String stringLiteral1 = "string1";
        final String stringLiteral2 = "string2";
        final String defaultStr = "defaultStr";
        final String noValueStr = "No value found";

        Lists.newArrayList(stringLiteral1, null).stream()
                .map(Optional::ofNullable)
                .forEach(element -> element.ifPresentOrElse( System.out::println,
                        () -> System.out.println(noValueStr)));

        Lists.newArrayList(stringLiteral1, null).stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElse(defaultStr))
                .forEach(System.out::println);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElseGet(() -> defaultStr))
                .forEach(System.out::println);

        Lists.newArrayList(stringLiteral1, null, stringLiteral2)
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.or(() -> Optional.of(defaultStr)))
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
