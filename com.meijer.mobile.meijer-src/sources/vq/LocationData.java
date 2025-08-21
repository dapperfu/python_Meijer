package vq;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvq/a;", "", "", "latitude", "longitude", "", "isMockedLocation", "<init>", "(DDZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "c", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vq.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class LocationData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double latitude;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double longitude;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMockedLocation;

    public LocationData() {
        this(0.0d, 0.0d, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) other;
        return Double.compare(this.latitude, locationData.latitude) == 0 && Double.compare(this.longitude, locationData.longitude) == 0 && this.isMockedLocation == locationData.isMockedLocation;
    }

    public LocationData(double d10, double d11, boolean z10) {
        this.latitude = d10;
        this.longitude = d11;
        this.isMockedLocation = z10;
    }

    /* renamed from: a, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: b, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsMockedLocation() {
        return this.isMockedLocation;
    }

    public int hashCode() {
        return (((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Boolean.hashCode(this.isMockedLocation);
    }

    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", isMockedLocation=" + this.isMockedLocation + ')';
    }

    public /* synthetic */ LocationData(double d10, double d11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? false : z10);
    }
}
