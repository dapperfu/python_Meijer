package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class CurationsCoordinate {
    protected Double latitude;
    protected Double longitude;

    protected CurationsCoordinate() {
    }

    public CurationsCoordinate(double d10, double d11) {
        this.latitude = Double.valueOf(d10);
        this.longitude = Double.valueOf(d11);
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }
}
