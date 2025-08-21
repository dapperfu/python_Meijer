package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1;
    public String icon;
    public String localIcon;
    public String name;
    public VehicleType type;

    public String toString() {
        return String.format("%s (%s)", this.name, this.type);
    }
}
