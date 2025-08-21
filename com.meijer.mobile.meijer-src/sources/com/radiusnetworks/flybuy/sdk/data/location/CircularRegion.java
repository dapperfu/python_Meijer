package com.radiusnetworks.flybuy.sdk.data.location;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "", "latitude", "", "longitude", "radius", "", "(DDF)V", "getLatitude", "()D", "getLongitude", "getRadius", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CircularRegion {
    private final double latitude;
    private final double longitude;
    private final float radius;

    public static /* synthetic */ CircularRegion copy$default(CircularRegion circularRegion, double d10, double d11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = circularRegion.latitude;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            d11 = circularRegion.longitude;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            f10 = circularRegion.radius;
        }
        return circularRegion.copy(d12, d13, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    public final CircularRegion copy(double latitude, double longitude, float radius) {
        return new CircularRegion(latitude, longitude, radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircularRegion)) {
            return false;
        }
        CircularRegion circularRegion = (CircularRegion) other;
        return Double.compare(this.latitude, circularRegion.latitude) == 0 && Double.compare(this.longitude, circularRegion.longitude) == 0 && Float.compare(this.radius, circularRegion.radius) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.radius) + ((Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31)) * 31);
    }

    public String toString() {
        return "CircularRegion(latitude=" + this.latitude + ", longitude=" + this.longitude + ", radius=" + this.radius + ')';
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getRadius() {
        return this.radius;
    }

    public CircularRegion(double d10, double d11, float f10) {
        this.latitude = d10;
        this.longitude = d11;
        this.radius = f10;
    }
}
