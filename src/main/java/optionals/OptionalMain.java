package optionals;

import com.google.common.collect.Lists;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Lists.newArrayList("str1", null).stream()
                .map(Optional::ofNullable)
                .forEach(element -> element.ifPresentOrElse( System.out::println,
                        () -> System.out.println("No value found")));

        Lists.newArrayList("str2", null).stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElse("default1"))
                .forEach(System.out::println);

        Lists.newArrayList("str3", null, "str4")
                .stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);

        Lists.newArrayList("str5", null, "str6")
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.orElseGet(() -> "default2"))
                .forEach(System.out::println);

        Lists.newArrayList("str7", null, "str8")
                .stream()
                .map(Optional::ofNullable)
                .map(element -> element.or(() -> Optional.of("default3")))
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
