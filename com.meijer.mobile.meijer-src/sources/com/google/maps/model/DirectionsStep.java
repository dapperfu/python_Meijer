package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class DirectionsStep implements Serializable {
    private static final long serialVersionUID = 1;
    public Distance distance;
    public Duration duration;
    public LatLng endLocation;
    public String htmlInstructions;

    @Deprecated
    public String maneuver;
    public EncodedPolyline polyline;
    public LatLng startLocation;
    public DirectionsStep[] steps;
    public TransitDetails transitDetails;
    public TravelMode travelMode;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[DirectionsStep: ");
        sb2.append("\"");
        sb2.append(this.htmlInstructions);
        sb2.append("\"");
        sb2.append(String.format(" (%s -> %s", this.startLocation, this.endLocation));
        sb2.append(")");
        sb2.append(" ");
        sb2.append(this.travelMode);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", distance=");
        sb2.append(this.distance);
        DirectionsStep[] directionsStepArr = this.steps;
        if (directionsStepArr != null && directionsStepArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.steps.length);
            sb2.append(" substeps");
        }
        if (this.transitDetails != null) {
            sb2.append(", transitDetails=");
            sb2.append(this.transitDetails);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
