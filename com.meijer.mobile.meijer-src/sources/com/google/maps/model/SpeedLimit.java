package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class SpeedLimit implements Serializable {
    private static final long serialVersionUID = 1;
    public String placeId;
    public double speedLimit;

    public long speedLimitMph() {
        return Math.round(this.speedLimit * 0.621371d);
    }

    public String toString() {
        return String.format("[%.0f km/h, placeId=%s]", Double.valueOf(this.speedLimit), this.placeId);
    }
}
