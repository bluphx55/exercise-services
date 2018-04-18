package com.ps.model;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@EqualsAndHashCode
@ToString
@Setter
@XmlRootElement
public class Activity {

    private String id;
    private String description;
    private int duration;

    public Activity() {}

    public String getId() {
        return id;
    }

    @XmlElement(name="desc")
    public String getDescription() {
        return this.description;
    }

    public int getDuration() {
        return this.duration;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Activity;
    }

}
