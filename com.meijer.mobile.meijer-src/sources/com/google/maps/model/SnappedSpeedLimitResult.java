package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class SnappedSpeedLimitResult implements Serializable {
    private static final long serialVersionUID = 1;
    public SnappedPoint[] snappedPoints;
    public SpeedLimit[] speedLimits;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[SnappedSpeedLimitResponse:");
        SpeedLimit[] speedLimitArr = this.speedLimits;
        if (speedLimitArr != null && speedLimitArr.length > 0) {
            sb2.append(" ");
            sb2.append(this.speedLimits.length);
            sb2.append(" speedLimits");
        }
        SnappedPoint[] snappedPointArr = this.snappedPoints;
        if (snappedPointArr != null && snappedPointArr.length > 0) {
            sb2.append(" ");
            sb2.append(this.snappedPoints.length);
            sb2.append(" speedLimits");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
