/*
 * This file is generated by jOOQ.
 */
package jooq.setup.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import jooq.setup.Keys;
import jooq.setup.Public;
import jooq.setup.tables.records.CountryLanguageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class CountryLanguage extends TableImpl<CountryLanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.country_language</code>
     */
    public static final CountryLanguage COUNTRY_LANGUAGE = new CountryLanguage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryLanguageRecord> getRecordType() {
        return CountryLanguageRecord.class;
    }

    /**
     * The column <code>public.country_language.country_code</code>.
     */
    public final TableField<CountryLanguageRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.country_language.language</code>.
     */
    public final TableField<CountryLanguageRecord, String> LANGUAGE = createField(DSL.name("language"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.country_language.is_official</code>.
     */
    public final TableField<CountryLanguageRecord, Boolean> IS_OFFICIAL = createField(DSL.name("is_official"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.country_language.percentage</code>.
     */
    public final TableField<CountryLanguageRecord, Float> PERCENTAGE = createField(DSL.name("percentage"), SQLDataType.REAL.nullable(false), this, "");

    private CountryLanguage(Name alias, Table<CountryLanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CountryLanguage(Name alias, Table<CountryLanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.country_language</code> table reference
     */
    public CountryLanguage(String alias) {
        this(DSL.name(alias), COUNTRY_LANGUAGE);
    }

    /**
     * Create an aliased <code>public.country_language</code> table reference
     */
    public CountryLanguage(Name alias) {
        this(alias, COUNTRY_LANGUAGE);
    }

    /**
     * Create a <code>public.country_language</code> table reference
     */
    public CountryLanguage() {
        this(DSL.name("country_language"), null);
    }

    public <O extends Record> CountryLanguage(Table<O> child, ForeignKey<O, CountryLanguageRecord> key) {
        super(child, key, COUNTRY_LANGUAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CountryLanguageRecord> getPrimaryKey() {
        return Keys.COUNTRY_LANGUAGE_PKEY;
    }

    @Override
    public List<ForeignKey<CountryLanguageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COUNTRY_LANGUAGE__COUNTRY_LANGUAGE_COUNTRY_CODE_FKEY);
    }

    private transient Country _country;

    /**
     * Get the implicit join path to the <code>public.country</code> table.
     */
    public Country country() {
        if (_country == null)
            _country = new Country(this, Keys.COUNTRY_LANGUAGE__COUNTRY_LANGUAGE_COUNTRY_CODE_FKEY);

        return _country;
    }

    @Override
    public CountryLanguage as(String alias) {
        return new CountryLanguage(DSL.name(alias), this);
    }

    @Override
    public CountryLanguage as(Name alias) {
        return new CountryLanguage(alias, this);
    }

    @Override
    public CountryLanguage as(Table<?> alias) {
        return new CountryLanguage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryLanguage rename(String name) {
        return new CountryLanguage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryLanguage rename(Name name) {
        return new CountryLanguage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryLanguage rename(Table<?> name) {
        return new CountryLanguage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Boolean, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super Boolean, ? super Float, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super Boolean, ? super Float, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
