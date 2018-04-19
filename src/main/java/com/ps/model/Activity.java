package com.ps.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement

public class Activity {

    private String id;
    @Getter(onMethod=@_({@XmlElement(name="desc")}))
    private String description;
    private int duration;
    private User user;

    public Activity() {}



}
