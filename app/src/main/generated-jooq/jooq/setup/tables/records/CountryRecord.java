/*
 * This file is generated by jOOQ.
 */
package jooq.setup.tables.records;


import java.math.BigDecimal;

import jooq.setup.tables.Country;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record15<String, String, String, String, Float, Short, Integer, Float, BigDecimal, BigDecimal, String, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.country.code</code>.
     */
    public CountryRecord setCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.country.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.country.name</code>.
     */
    public CountryRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.country.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.country.continent</code>.
     */
    public CountryRecord setContinent(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.country.continent</code>.
     */
    public String getContinent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.country.region</code>.
     */
    public CountryRecord setRegion(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.country.region</code>.
     */
    public String getRegion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.country.surface_area</code>.
     */
    public CountryRecord setSurfaceArea(Float value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.country.surface_area</code>.
     */
    public Float getSurfaceArea() {
        return (Float) get(4);
    }

    /**
     * Setter for <code>public.country.indep_year</code>.
     */
    public CountryRecord setIndepYear(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.country.indep_year</code>.
     */
    public Short getIndepYear() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>public.country.population</code>.
     */
    public CountryRecord setPopulation(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.country.population</code>.
     */
    public Integer getPopulation() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.country.life_expectancy</code>.
     */
    public CountryRecord setLifeExpectancy(Float value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.country.life_expectancy</code>.
     */
    public Float getLifeExpectancy() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>public.country.gnp</code>. GNP is Gross national product
     */
    public CountryRecord setGnp(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.country.gnp</code>. GNP is Gross national product
     */
    public BigDecimal getGnp() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.country.gnp_old</code>.
     */
    public CountryRecord setGnpOld(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.country.gnp_old</code>.
     */
    public BigDecimal getGnpOld() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.country.local_name</code>.
     */
    public CountryRecord setLocalName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.country.local_name</code>.
     */
    public String getLocalName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.country.government_form</code>.
     */
    public CountryRecord setGovernmentForm(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.country.government_form</code>.
     */
    public String getGovernmentForm() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.country.head_of_state</code>.
     */
    public CountryRecord setHeadOfState(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.country.head_of_state</code>.
     */
    public String getHeadOfState() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.country.capital</code>.
     */
    public CountryRecord setCapital(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.country.capital</code>.
     */
    public Integer getCapital() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.country.code2</code>. Following ISO 3166-1
     * alpha-2 code
     */
    public CountryRecord setCode2(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.country.code2</code>. Following ISO 3166-1
     * alpha-2 code
     */
    public String getCode2() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, Float, Short, Integer, Float, BigDecimal, BigDecimal, String, String, String, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, String, String, String, Float, Short, Integer, Float, BigDecimal, BigDecimal, String, String, String, Integer, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Country.COUNTRY.CODE;
    }

    @Override
    public Field<String> field2() {
        return Country.COUNTRY.NAME;
    }

    @Override
    public Field<String> field3() {
        return Country.COUNTRY.CONTINENT;
    }

    @Override
    public Field<String> field4() {
        return Country.COUNTRY.REGION;
    }

    @Override
    public Field<Float> field5() {
        return Country.COUNTRY.SURFACE_AREA;
    }

    @Override
    public Field<Short> field6() {
        return Country.COUNTRY.INDEP_YEAR;
    }

    @Override
    public Field<Integer> field7() {
        return Country.COUNTRY.POPULATION;
    }

    @Override
    public Field<Float> field8() {
        return Country.COUNTRY.LIFE_EXPECTANCY;
    }

    @Override
    public Field<BigDecimal> field9() {
        return Country.COUNTRY.GNP;
    }

    @Override
    public Field<BigDecimal> field10() {
        return Country.COUNTRY.GNP_OLD;
    }

    @Override
    public Field<String> field11() {
        return Country.COUNTRY.LOCAL_NAME;
    }

    @Override
    public Field<String> field12() {
        return Country.COUNTRY.GOVERNMENT_FORM;
    }

    @Override
    public Field<String> field13() {
        return Country.COUNTRY.HEAD_OF_STATE;
    }

    @Override
    public Field<Integer> field14() {
        return Country.COUNTRY.CAPITAL;
    }

    @Override
    public Field<String> field15() {
        return Country.COUNTRY.CODE2;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getContinent();
    }

    @Override
    public String component4() {
        return getRegion();
    }

    @Override
    public Float component5() {
        return getSurfaceArea();
    }

    @Override
    public Short component6() {
        return getIndepYear();
    }

    @Override
    public Integer component7() {
        return getPopulation();
    }

    @Override
    public Float component8() {
        return getLifeExpectancy();
    }

    @Override
    public BigDecimal component9() {
        return getGnp();
    }

    @Override
    public BigDecimal component10() {
        return getGnpOld();
    }

    @Override
    public String component11() {
        return getLocalName();
    }

    @Override
    public String component12() {
        return getGovernmentForm();
    }

    @Override
    public String component13() {
        return getHeadOfState();
    }

    @Override
    public Integer component14() {
        return getCapital();
    }

    @Override
    public String component15() {
        return getCode2();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getContinent();
    }

    @Override
    public String value4() {
        return getRegion();
    }

    @Override
    public Float value5() {
        return getSurfaceArea();
    }

    @Override
    public Short value6() {
        return getIndepYear();
    }

    @Override
    public Integer value7() {
        return getPopulation();
    }

    @Override
    public Float value8() {
        return getLifeExpectancy();
    }

    @Override
    public BigDecimal value9() {
        return getGnp();
    }

    @Override
    public BigDecimal value10() {
        return getGnpOld();
    }

    @Override
    public String value11() {
        return getLocalName();
    }

    @Override
    public String value12() {
        return getGovernmentForm();
    }

    @Override
    public String value13() {
        return getHeadOfState();
    }

    @Override
    public Integer value14() {
        return getCapital();
    }

    @Override
    public String value15() {
        return getCode2();
    }

    @Override
    public CountryRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CountryRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CountryRecord value3(String value) {
        setContinent(value);
        return this;
    }

    @Override
    public CountryRecord value4(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public CountryRecord value5(Float value) {
        setSurfaceArea(value);
        return this;
    }

    @Override
    public CountryRecord value6(Short value) {
        setIndepYear(value);
        return this;
    }

    @Override
    public CountryRecord value7(Integer value) {
        setPopulation(value);
        return this;
    }

    @Override
    public CountryRecord value8(Float value) {
        setLifeExpectancy(value);
        return this;
    }

    @Override
    public CountryRecord value9(BigDecimal value) {
        setGnp(value);
        return this;
    }

    @Override
    public CountryRecord value10(BigDecimal value) {
        setGnpOld(value);
        return this;
    }

    @Override
    public CountryRecord value11(String value) {
        setLocalName(value);
        return this;
    }

    @Override
    public CountryRecord value12(String value) {
        setGovernmentForm(value);
        return this;
    }

    @Override
    public CountryRecord value13(String value) {
        setHeadOfState(value);
        return this;
    }

    @Override
    public CountryRecord value14(Integer value) {
        setCapital(value);
        return this;
    }

    @Override
    public CountryRecord value15(String value) {
        setCode2(value);
        return this;
    }

    @Override
    public CountryRecord values(String value1, String value2, String value3, String value4, Float value5, Short value6, Integer value7, Float value8, BigDecimal value9, BigDecimal value10, String value11, String value12, String value13, Integer value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(String code, String name, String continent, String region, Float surfaceArea, Short indepYear, Integer population, Float lifeExpectancy, BigDecimal gnp, BigDecimal gnpOld, String localName, String governmentForm, String headOfState, Integer capital, String code2) {
        super(Country.COUNTRY);

        setCode(code);
        setName(name);
        setContinent(continent);
        setRegion(region);
        setSurfaceArea(surfaceArea);
        setIndepYear(indepYear);
        setPopulation(population);
        setLifeExpectancy(lifeExpectancy);
        setGnp(gnp);
        setGnpOld(gnpOld);
        setLocalName(localName);
        setGovernmentForm(governmentForm);
        setHeadOfState(headOfState);
        setCapital(capital);
        setCode2(code2);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(jooq.setup.tables.pojos.Country value) {
        super(Country.COUNTRY);

        if (value != null) {
            setCode(value.getCode());
            setName(value.getName());
            setContinent(value.getContinent());
            setRegion(value.getRegion());
            setSurfaceArea(value.getSurfaceArea());
            setIndepYear(value.getIndepYear());
            setPopulation(value.getPopulation());
            setLifeExpectancy(value.getLifeExpectancy());
            setGnp(value.getGnp());
            setGnpOld(value.getGnpOld());
            setLocalName(value.getLocalName());
            setGovernmentForm(value.getGovernmentForm());
            setHeadOfState(value.getHeadOfState());
            setCapital(value.getCapital());
            setCode2(value.getCode2());
            resetChangedOnNotNull();
        }
    }
}
