package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class Geometry implements Serializable {
    private static final long serialVersionUID = 1;
    public Bounds bounds;
    public LatLng location;
    public LocationType locationType;
    public Bounds viewport;

    public String toString() {
        return String.format("[Geometry: %s (%s) bounds=%s, viewport=%s]", this.location, this.locationType, this.bounds, this.viewport);
    }
}
