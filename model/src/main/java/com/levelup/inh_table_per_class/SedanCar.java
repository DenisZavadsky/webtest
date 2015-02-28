package com.levelup.inh_table_per_class;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SedanCar extends Car {

    private Boolean extendedStorage;

    public Boolean getExtendedStorage() {
        return extendedStorage;
    }

    public void setExtendedStorage(Boolean extendedStorage) {
        this.extendedStorage = extendedStorage;
    }
}
