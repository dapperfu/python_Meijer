package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Geofence;", "", "latitude", "", "longitude", "radiusMeters", "", "(Ljava/lang/String;Ljava/lang/String;F)V", "getLatitude", "()Ljava/lang/String;", "getLongitude", "getRadiusMeters", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Geofence {
    private final String latitude;
    private final String longitude;

    @InterfaceC15617c("radius_meters")
    private final float radiusMeters;

    public Geofence(String latitude, String longitude, float f10) {
        Intrinsics.j(latitude, "latitude");
        Intrinsics.j(longitude, "longitude");
        this.latitude = latitude;
        this.longitude = longitude;
        this.radiusMeters = f10;
    }

    public static /* synthetic */ Geofence copy$default(Geofence geofence, String str, String str2, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geofence.latitude;
        }
        if ((i10 & 2) != 0) {
            str2 = geofence.longitude;
        }
        if ((i10 & 4) != 0) {
            f10 = geofence.radiusMeters;
        }
        return geofence.copy(str, str2, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRadiusMeters() {
        return this.radiusMeters;
    }

    public final Geofence copy(String latitude, String longitude, float radiusMeters) {
        Intrinsics.j(latitude, "latitude");
        Intrinsics.j(longitude, "longitude");
        return new Geofence(latitude, longitude, radiusMeters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geofence)) {
            return false;
        }
        Geofence geofence = (Geofence) other;
        return Intrinsics.e(this.latitude, geofence.latitude) && Intrinsics.e(this.longitude, geofence.longitude) && Float.compare(this.radiusMeters, geofence.radiusMeters) == 0;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final float getRadiusMeters() {
        return this.radiusMeters;
    }

    public String toString() {
        return "Geofence(latitude=" + this.latitude + ", longitude=" + this.longitude + ", radiusMeters=" + this.radiusMeters + ')';
    }

    public int hashCode() {
        return Float.hashCode(this.radiusMeters) + a.a(this.longitude, this.latitude.hashCode() * 31, 31);
    }
}
