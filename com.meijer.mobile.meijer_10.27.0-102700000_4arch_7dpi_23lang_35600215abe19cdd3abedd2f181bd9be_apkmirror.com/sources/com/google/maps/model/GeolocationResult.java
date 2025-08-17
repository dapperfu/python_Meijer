package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class GeolocationResult implements Serializable {
    private static final long serialVersionUID = 1;
    public double accuracy;
    public LatLng location;

    public String toString() {
        return String.format("%s, accuracy=%s m", this.location, Double.valueOf(this.accuracy));
    }
}
