package com.google.maps.model;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class DirectionsRoute implements Serializable {
    private static final long serialVersionUID = 1;
    public Bounds bounds;
    public String copyrights;
    public Fare fare;
    public DirectionsLeg[] legs;
    public EncodedPolyline overviewPolyline;
    public String summary;
    public String[] warnings;
    public int[] waypointOrder;

    public String toString() {
        String str = String.format("[DirectionsRoute: \"%s\", %d legs, waypointOrder=%s, bounds=%s", this.summary, Integer.valueOf(this.legs.length), Arrays.toString(this.waypointOrder), this.bounds);
        if (this.fare != null) {
            str = str + ", fare=" + this.fare;
        }
        String[] strArr = this.warnings;
        if (strArr != null && strArr.length > 0) {
            str = str + ", " + this.warnings.length + " warnings";
        }
        return str + "]";
    }
}
