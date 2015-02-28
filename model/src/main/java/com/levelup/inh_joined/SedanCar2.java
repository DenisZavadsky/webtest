package com.levelup.inh_joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@PrimaryKeyJoinColumn(name = "CAR_ID")
public class SedanCar2 extends Car2{
    private Boolean extendedStorage;

    public Boolean getExtendedStorage() {
        return extendedStorage;
    }

    public void setExtendedStorage(Boolean extendedStorage) {
        this.extendedStorage = extendedStorage;
    }
}
