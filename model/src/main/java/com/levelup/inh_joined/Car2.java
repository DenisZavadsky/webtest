package com.levelup.inh_joined;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by denis_zavadsky on 2/28/15.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Car2 implements Serializable {
    private Long id;
    private String model;
    private String vendor;
    private Integer color;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}
