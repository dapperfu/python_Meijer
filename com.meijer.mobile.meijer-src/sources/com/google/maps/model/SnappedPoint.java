package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class SnappedPoint implements Serializable {
    private static final long serialVersionUID = 1;
    public LatLng location;
    public int originalIndex = -1;
    public String placeId;

    public String toString() {
        return String.format("[%s, placeId=%s, originalIndex=%s]", this.location, this.placeId, Integer.valueOf(this.originalIndex));
    }
}
