package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class TransitLine implements Serializable {
    private static final long serialVersionUID = 1;
    public TransitAgency[] agencies;
    public String color;
    public String icon;
    public String name;
    public String shortName;
    public String textColor;
    public String url;
    public Vehicle vehicle;

    public String toString() {
        return String.format("%s \"%s\"", this.shortName, this.name);
    }
}
