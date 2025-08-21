package com.google.maps.model;

import j$.time.ZonedDateTime;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class DirectionsLeg implements Serializable {
    private static final long serialVersionUID = 1;
    public ZonedDateTime arrivalTime;
    public ZonedDateTime departureTime;
    public Distance distance;
    public Duration duration;
    public Duration durationInTraffic;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public DirectionsStep[] steps;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(String.format("[DirectionsLeg: \"%s\" -> \"%s\" (%s -> %s)", this.startAddress, this.endAddress, this.startLocation, this.endLocation));
        if (this.departureTime != null) {
            sb2.append(", departureTime=");
            sb2.append(this.departureTime);
        }
        if (this.arrivalTime != null) {
            sb2.append(", arrivalTime=");
            sb2.append(this.arrivalTime);
        }
        if (this.durationInTraffic != null) {
            sb2.append(", durationInTraffic=");
            sb2.append(this.durationInTraffic);
        }
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(": ");
        sb2.append(this.steps.length);
        sb2.append(" steps]");
        return sb2.toString();
    }
}
