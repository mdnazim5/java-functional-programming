package functionalInterface.supplier;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    static final String JDBC_URL_USERS = "jdbc://localhost:5432/users";
    static final String JDBC_URL_CUSTOMER = "jdbc://localhost:5432/customer";

    public final Supplier<String> getDBConnectionUrl = () -> JDBC_URL_USERS;

    public final Supplier<List<String>> getDBConnectionUrls = ()
            -> Lists.newArrayList(
            JDBC_URL_USERS,
            JDBC_URL_CUSTOMER);

}
