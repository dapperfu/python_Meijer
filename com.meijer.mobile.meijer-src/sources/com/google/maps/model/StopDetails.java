package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class StopDetails implements Serializable {
    private static final long serialVersionUID = 1;
    public LatLng location;
    public String name;

    public String toString() {
        return String.format("%s (%s)", this.name, this.location);
    }
}
