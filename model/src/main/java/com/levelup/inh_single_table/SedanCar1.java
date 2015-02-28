package com.levelup.inh_single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@DiscriminatorValue(value = "sedan")
public class SedanCar1 extends Car1 {
    private Boolean extendedStorage;

    public Boolean getExtendedStorage() {
        return extendedStorage;
    }

    public void setExtendedStorage(Boolean extendedStorage) {
        this.extendedStorage = extendedStorage;
    }
}
