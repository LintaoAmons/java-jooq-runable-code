/*
 * This file is generated by jOOQ.
 */
package jooq.setup.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import jooq.setup.Keys;
import jooq.setup.Public;
import jooq.setup.tables.records.CityRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class City extends TableImpl<CityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.city</code>
     */
    public static final City CITY = new City();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityRecord> getRecordType() {
        return CityRecord.class;
    }

    /**
     * The column <code>public.city.id</code>.
     */
    public final TableField<CityRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.city.name</code>.
     */
    public final TableField<CityRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.city.country_code</code>.
     */
    public final TableField<CityRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.city.district</code>.
     */
    public final TableField<CityRecord, String> DISTRICT = createField(DSL.name("district"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.city.population</code>.
     */
    public final TableField<CityRecord, Integer> POPULATION = createField(DSL.name("population"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.city.local_name</code>. City local name
     */
    public final TableField<CityRecord, String> LOCAL_NAME = createField(DSL.name("local_name"), SQLDataType.CLOB, this, "City local name");

    private City(Name alias, Table<CityRecord> aliased) {
        this(alias, aliased, null);
    }

    private City(Name alias, Table<CityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(String alias) {
        this(DSL.name(alias), CITY);
    }

    /**
     * Create an aliased <code>public.city</code> table reference
     */
    public City(Name alias) {
        this(alias, CITY);
    }

    /**
     * Create a <code>public.city</code> table reference
     */
    public City() {
        this(DSL.name("city"), null);
    }

    public <O extends Record> City(Table<O> child, ForeignKey<O, CityRecord> key) {
        super(child, key, CITY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CityRecord> getPrimaryKey() {
        return Keys.CITY_PKEY;
    }

    @Override
    public List<ForeignKey<CityRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CITY__COUNTRY_FK);
    }

    private transient Country _country;

    /**
     * Get the implicit join path to the <code>public.country</code> table.
     */
    public Country country() {
        if (_country == null)
            _country = new Country(this, Keys.CITY__COUNTRY_FK);

        return _country;
    }

    @Override
    public City as(String alias) {
        return new City(DSL.name(alias), this);
    }

    @Override
    public City as(Name alias) {
        return new City(alias, this);
    }

    @Override
    public City as(Table<?> alias) {
        return new City(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(String name) {
        return new City(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Name name) {
        return new City(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public City rename(Table<?> name) {
        return new City(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}