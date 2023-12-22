package jooq.setup.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * DslConfig
 */
public class DslConfig {

    public static DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5499/world-db");
        config.setUsername("world");
        config.setPassword("world123");
        // Additional configuration...

        return new HikariDataSource(config);
    }

    public static DSLContext createDslContext() {
        DataSource dataSource = dataSource();
        return DSL.using(dataSource, SQLDialect.POSTGRES); // Change SQLDialect as per your DBMS
    }

    // ---
    // alternatively use Connection
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5499";
        String user = "world";
        String password = "world123";

        return DriverManager.getConnection(url, user, password);
    }

    public static Optional<DSLContext> createDslContextByConnection() {
        try {
            return Optional.of(DSL.using(getConnection(), SQLDialect.POSTGRES));
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    // ---
    // dsl for get the sql string
    public static DSLContext createDslContextForSqlString() {
        return DSL.using(SQLDialect.POSTGRES);
    }
}
