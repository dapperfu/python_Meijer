package com.google.maps.model;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class GeocodedWaypoint implements Serializable {
    private static final long serialVersionUID = 1;
    public GeocodedWaypointStatus geocoderStatus;
    public boolean partialMatch;
    public String placeId;
    public AddressType[] types;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[GeocodedWaypoint");
        sb2.append(" ");
        sb2.append(this.geocoderStatus);
        if (this.partialMatch) {
            sb2.append(" ");
            sb2.append("PARTIAL MATCH");
        }
        sb2.append(" placeId=");
        sb2.append(this.placeId);
        sb2.append(", types=");
        sb2.append(Arrays.toString(this.types));
        return sb2.toString();
    }
}
