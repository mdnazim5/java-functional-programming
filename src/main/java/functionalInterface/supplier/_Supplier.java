package functionalInterface.supplier;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public Supplier<String> getDBConnectionUrl = () -> "jdbc://localhost:5432/users";

    public Supplier<List<String>> getDBConnectionUrls = ()
            -> Lists.newArrayList(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");

}
