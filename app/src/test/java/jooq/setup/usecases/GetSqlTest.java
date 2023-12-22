package jooq.setup.usecases;

import org.junit.jupiter.api.Test;

public class GetSqlTest {
    @Test
    void testGetSql() {
        GetSql getSql = new GetSql();
        getSql.getSql();
    }
}

