package com.levelup.inh_table_per_class;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class HatchCar extends Car {

    private Boolean isLong;

    public Boolean getIsLong() {
        return isLong;
    }

    public void setIsLong(Boolean isLong) {
        this.isLong = isLong;
    }
}
