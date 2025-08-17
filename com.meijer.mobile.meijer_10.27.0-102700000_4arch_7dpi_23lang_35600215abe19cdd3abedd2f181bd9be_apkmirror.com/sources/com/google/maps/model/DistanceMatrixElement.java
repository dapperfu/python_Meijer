package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class DistanceMatrixElement implements Serializable {
    private static final long serialVersionUID = 1;
    public Distance distance;
    public Duration duration;
    public Duration durationInTraffic;
    public Fare fare;
    public DistanceMatrixElementStatus status;

    public String toString() {
        String str = String.format("[DistanceMatrixElement %s distance=%s, duration=%s", this.status, this.distance, this.duration);
        if (this.durationInTraffic != null) {
            str = str + ", durationInTraffic=" + this.durationInTraffic;
        }
        if (this.fare != null) {
            str = str + ", fare=" + this.fare;
        }
        return str + "]";
    }
}
