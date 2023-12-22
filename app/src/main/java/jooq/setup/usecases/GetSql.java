package jooq.setup.usecases;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import jooq.setup.Tables;

/**
 * GetSql
 */
public class GetSql {
    public void getSql() {
        DSLContext dslContext = DSL.using(SQLDialect.POSTGRES);
        String sql = dslContext.selectFrom(Tables.CITY).getSQL();
        System.out.println(sql);
        // output: 
        // select "public"."city"."id", "public"."city"."name", "public"."city"."country_code", "public"."city"."district", "public"."city"."population", "public"."city"."local_name" from "public"."city"
    }
}
