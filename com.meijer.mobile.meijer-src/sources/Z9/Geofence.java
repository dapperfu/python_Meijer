package Z9;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$¨\u0006%"}, d2 = {"LZ9/a;", "", "", PreferencesHelper.PREF_ID, "", "lat", "lon", "radius", "waitInterval", "", "LZ9/b;", "triggers", "<init>", "(Ljava/lang/String;DDDLjava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "()D", "c", "d", "e", "Ljava/lang/Double;", "getWaitInterval", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "()Ljava/util/List;", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Z9.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Geofence {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lat;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double radius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double waitInterval;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Trigger> triggers;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geofence)) {
            return false;
        }
        Geofence geofence = (Geofence) other;
        return Intrinsics.e(this.id, geofence.id) && Double.compare(this.lat, geofence.lat) == 0 && Double.compare(this.lon, geofence.lon) == 0 && Double.compare(this.radius, geofence.radius) == 0 && Intrinsics.e(this.waitInterval, geofence.waitInterval) && Intrinsics.e(this.triggers, geofence.triggers);
    }

    public Geofence(String id2, double d10, double d11, double d12, Double d13, List<Trigger> triggers) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(triggers, "triggers");
        this.id = id2;
        this.lat = d10;
        this.lon = d11;
        this.radius = d12;
        this.waitInterval = d13;
        this.triggers = triggers;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: c, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: d, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    public final List<Trigger> e() {
        return this.triggers;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lon)) * 31) + Double.hashCode(this.radius)) * 31;
        Double d10 = this.waitInterval;
        return ((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.triggers.hashCode();
    }

    public String toString() {
        return "Geofence(id=" + this.id + ", lat=" + this.lat + ", lon=" + this.lon + ", radius=" + this.radius + ", waitInterval=" + this.waitInterval + ", triggers=" + this.triggers + ")";
    }
}
