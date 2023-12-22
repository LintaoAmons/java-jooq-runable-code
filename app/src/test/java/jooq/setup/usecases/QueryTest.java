package jooq.setup.usecases;

import org.junit.jupiter.api.Test;

public class QueryTest {
    Query query = new Query();

    @Test
    void testBasicSelect() {
        query.basicSelect();
    }

    @Test
    void testBasicSelect_FetchInto() {
        query.basicSelect_FetchInto();
    }

    @Test
    void testSelectSpecificColumn() {
        query.selectSpecificColumn();
    }

    @Test
    void test_withWhereCondition() {
        query.withWhereCondition();
    }

    @Test
    void test_withJoin() {
        query.withJoin();
    }

    @Test
    void test_withJoin_ColumnsFromBothTables() {
        query.withJoin_ColumnsFromBothTables();
    }

    @Test
    void test_aggragationAndGroup() {
        query.aggragationAndGroup();
    }

    @Test
    void test_sortOrder() {
        query.sortOrder();
    }

    @Test
    void test_page() {
        query.page();
    }

    @Test
    void test_union() {
        query.union();
    }

    @Test
    void test_nestedQuery() {
        query.nestedQuery();
    }
}
