package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class ElevationResult implements Serializable {
    private static final long serialVersionUID = 1;
    public double elevation;
    public LatLng location;
    public double resolution;

    public String toString() {
        return String.format("(%s, %f m, resolution=%f m)", this.location, Double.valueOf(this.elevation), Double.valueOf(this.resolution));
    }
}
