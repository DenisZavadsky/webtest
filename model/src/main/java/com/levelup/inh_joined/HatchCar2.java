package com.levelup.inh_joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@PrimaryKeyJoinColumn(name = "CAR_ID")
public class HatchCar2 extends Car2 {
    private Boolean isLong;

    public Boolean getIsLong() {
        return isLong;
    }

    public void setIsLong(Boolean isLong) {
        this.isLong = isLong;
    }
}
