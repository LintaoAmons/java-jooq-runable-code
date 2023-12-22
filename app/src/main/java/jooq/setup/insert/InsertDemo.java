package jooq.setup.insert;

import jooq.setup.config.DslConfig;
import jooq.setup.tables.pojos.City;
import jooq.setup.tables.records.CityRecord;

/**
 * InsertDemo
 */
public class InsertDemo {
    private DslConfig dslConfig;

    public InsertDemo(DslConfig dslConfig) {
        this.dslConfig = dslConfig;
    }

    public void insertDemo() {
        CityRecord cityRecord = new CityRecord()
                .setName("MyCity")
                .setCountryCode("LIN")
                .setDistrict("amons")
                .setPopulation(1234)
                .setLocalName("localname");

        // cityRecord.attach(dslConfig.);
    }

}
