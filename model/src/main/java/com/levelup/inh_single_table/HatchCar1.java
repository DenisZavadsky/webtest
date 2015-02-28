package com.levelup.inh_single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@DiscriminatorValue(value = "hatch")
public class HatchCar1 extends Car1{

    private Boolean isLong;

    public Boolean getIsLong() {
        return isLong;
    }

    public void setIsLong(Boolean isLong) {
        this.isLong = isLong;
    }
}
