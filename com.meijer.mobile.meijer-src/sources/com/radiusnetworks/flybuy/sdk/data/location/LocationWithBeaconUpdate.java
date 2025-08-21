package com.radiusnetworks.flybuy.sdk.data.location;

import android.location.Location;
import com.radiusnetworks.flybuy.sdk.data.beacons.Beacon;
import com.radiusnetworks.flybuy.sdk.util.LocationExtensionsKt;
import j$.time.Instant;
import java.util.List;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB\u001f\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001b¨\u00062"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/location/LocationWithBeaconUpdate;", "", "", "latitude", "longitude", "", "speed", "accuracy", "j$/time/Instant", "locationAt", "", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/Beacon;", "beacons", "<init>", "(DDFFLj$/time/Instant;Ljava/util/List;)V", "Landroid/location/Location;", "location", "(Landroid/location/Location;Ljava/util/List;)V", "component1", "()D", "component2", "component3", "()F", "component4", "component5", "()Lj$/time/Instant;", "component6", "()Ljava/util/List;", "copy", "(DDFFLj$/time/Instant;Ljava/util/List;)Lcom/radiusnetworks/flybuy/sdk/data/location/LocationWithBeaconUpdate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "getLongitude", "F", "getSpeed", "getAccuracy", "Lj$/time/Instant;", "getLocationAt", "Ljava/util/List;", "getBeacons", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
/* loaded from: classes12.dex */
public final /* data */ class LocationWithBeaconUpdate {
    private final float accuracy;
    private final List<Beacon> beacons;
    private final double latitude;
    private final Instant locationAt;
    private final double longitude;
    private final float speed;

    public LocationWithBeaconUpdate(double d10, double d11, float f10, float f11, Instant locationAt, List<Beacon> beacons) {
        Intrinsics.j(locationAt, "locationAt");
        Intrinsics.j(beacons, "beacons");
        this.latitude = d10;
        this.longitude = d11;
        this.speed = f10;
        this.accuracy = f11;
        this.locationAt = locationAt;
        this.beacons = beacons;
    }

    public static /* synthetic */ LocationWithBeaconUpdate copy$default(LocationWithBeaconUpdate locationWithBeaconUpdate, double d10, double d11, float f10, float f11, Instant instant, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = locationWithBeaconUpdate.latitude;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            d11 = locationWithBeaconUpdate.longitude;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            f10 = locationWithBeaconUpdate.speed;
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            f11 = locationWithBeaconUpdate.accuracy;
        }
        return locationWithBeaconUpdate.copy(d12, d13, f12, f11, (i10 & 16) != 0 ? locationWithBeaconUpdate.locationAt : instant, (i10 & 32) != 0 ? locationWithBeaconUpdate.beacons : list);
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
    public final float getSpeed() {
        return this.speed;
    }

    /* renamed from: component4, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getLocationAt() {
        return this.locationAt;
    }

    public final List<Beacon> component6() {
        return this.beacons;
    }

    public final LocationWithBeaconUpdate copy(double latitude, double longitude, float speed, float accuracy, Instant locationAt, List<Beacon> beacons) {
        Intrinsics.j(locationAt, "locationAt");
        Intrinsics.j(beacons, "beacons");
        return new LocationWithBeaconUpdate(latitude, longitude, speed, accuracy, locationAt, beacons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationWithBeaconUpdate)) {
            return false;
        }
        LocationWithBeaconUpdate locationWithBeaconUpdate = (LocationWithBeaconUpdate) other;
        return Double.compare(this.latitude, locationWithBeaconUpdate.latitude) == 0 && Double.compare(this.longitude, locationWithBeaconUpdate.longitude) == 0 && Float.compare(this.speed, locationWithBeaconUpdate.speed) == 0 && Float.compare(this.accuracy, locationWithBeaconUpdate.accuracy) == 0 && Intrinsics.e(this.locationAt, locationWithBeaconUpdate.locationAt) && Intrinsics.e(this.beacons, locationWithBeaconUpdate.beacons);
    }

    public int hashCode() {
        return this.beacons.hashCode() + ((this.locationAt.hashCode() + ((Float.hashCode(this.accuracy) + ((Float.hashCode(this.speed) + ((Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "LocationWithBeaconUpdate(latitude=" + this.latitude + ", longitude=" + this.longitude + ", speed=" + this.speed + ", accuracy=" + this.accuracy + ", locationAt=" + this.locationAt + ", beacons=" + this.beacons + ')';
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final List<Beacon> getBeacons() {
        return this.beacons;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final Instant getLocationAt() {
        return this.locationAt;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getSpeed() {
        return this.speed;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationWithBeaconUpdate(Location location, List<Beacon> beacons) {
        this(location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), LocationExtensionsKt.getTimeInstant(location), beacons);
        Intrinsics.j(location, "location");
        Intrinsics.j(beacons, "beacons");
    }
}
