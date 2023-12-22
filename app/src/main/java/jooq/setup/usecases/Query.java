package jooq.setup.usecases;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.impl.DSL;

import jooq.setup.Tables;
import jooq.setup.config.DslConfig;
import jooq.setup.tables.pojos.City;

/**
 * Query
 */
public class Query {

    private DSLContext create;

    public Query() {
        create = DslConfig.createDslContext();
    }

    public void basicSelect() {
        Result<Record> fetch = create.select()
                .from(Tables.CITY)
                .fetch();

        for (Record record : fetch) {
            System.out.println(record);
        }
    }

    public void basicSelect_FetchInto() {
        List<City> cities = create.select()
                .from(Tables.CITY)
                .fetchInto(City.class);

        for (City city : cities) {
            System.out.println(city);
        }
    }

    public void selectSpecificColumn() {
        Result<Record1<String>> fetch = create.select(Tables.CITY.NAME)
                .from(Tables.CITY)
                .fetch();

        for (Record1<String> record1 : fetch) {
            System.out.println(record1);
        }
    }

    public void withWhereCondition() {
        Record fetchOne = create.select()
                .from(Tables.CITY)
                .where(Tables.CITY.ID.eq(1))
                .fetchOne();

        System.out.println(fetchOne);
    }

    public void withJoin() {
        Record fetchOne = create.select()
                .from(Tables.CITY)
                .join(Tables.COUNTRY).on(Tables.COUNTRY.CODE.eq(Tables.CITY.COUNTRY_CODE))
                .where(Tables.CITY.ID.eq(1))
                .fetchOne();

        System.out.println(fetchOne);
    }

    public void withJoin_ColumnsFromBothTables() {
        // previous method will only contains the columns from CITY table
        // to have columns of both tables,
        // we need to specify inside the select parameters

        Record4<String, Integer, String, String> fetchOne = create.select(
                Tables.CITY.COUNTRY_CODE, Tables.CITY.ID, Tables.CITY.NAME,
                Tables.COUNTRY.NAME)
                .from(Tables.CITY)
                .join(Tables.COUNTRY).on(Tables.COUNTRY.CODE.eq(Tables.CITY.COUNTRY_CODE))
                .where(Tables.CITY.ID.eq(1))
                .fetchOne();

        System.out.println(fetchOne);
    }

    public void aggragationAndGroup() {
        Result<Record2<String, Integer>> fetch = create.select(Tables.CITY.COUNTRY_CODE, DSL.count())
                .from(Tables.CITY)
                .groupBy(Tables.CITY.COUNTRY_CODE)
                .fetch();

        System.out.println(fetch);
    }

    public void sortOrder() {
        Result<Record2<String, Integer>> fetch = create
                .select(Tables.CITY.COUNTRY_CODE, DSL.count().as("count"))
                .from(Tables.CITY)
                .groupBy(Tables.CITY.COUNTRY_CODE)
                .orderBy(DSL.field("count").desc()) // or .asc() for ascending order
                .fetch();

        System.out.println(fetch);
    }

    public void page() {
        Result<Record2<String, Integer>> fetch = create
                .select(Tables.CITY.COUNTRY_CODE, DSL.count().as("count"))
                .from(Tables.CITY)
                .groupBy(Tables.CITY.COUNTRY_CODE)
                .orderBy(DSL.field("count").desc()) // or .asc() for ascending order
                .limit(2, 2)
                .fetch();

        System.out.println(fetch);
    }

    public void union() {
        Result<Record1<String>> fetch = create.select(Tables.CITY.COUNTRY_CODE.as("column_name"))
                .from(Tables.CITY)
                .union(
                        DSL.select(Tables.COUNTRY.NAME.as("column_name"))
                                .from(Tables.COUNTRY))
                .fetch();

        System.out.println(fetch);
    }

    public void nestedQuery() {
        Result<Record> fetch = create.select()
                .from(Tables.CITY)
                .where(Tables.CITY.COUNTRY_CODE.eq(
                        DSL.select(Tables.COUNTRY.CODE).from(Tables.COUNTRY).limit(1)))
                .fetch();

        System.out.println(fetch);
    }
}
