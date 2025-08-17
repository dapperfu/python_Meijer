package ha;

import X9.Geofence;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lha/a;", "", "", PreferencesHelper.PREF_ID, "", "waitInterval", "", "LX9/a;", "geofences", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Double;", "getWaitInterval", "()Ljava/lang/Double;", "c", "Ljava/util/List;", "()Ljava/util/List;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ha.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class GeofenceGroup {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double waitInterval;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Geofence> geofences;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeofenceGroup)) {
            return false;
        }
        GeofenceGroup geofenceGroup = (GeofenceGroup) other;
        return Intrinsics.e(this.id, geofenceGroup.id) && Intrinsics.e(this.waitInterval, geofenceGroup.waitInterval) && Intrinsics.e(this.geofences, geofenceGroup.geofences);
    }

    public GeofenceGroup(String id2, Double d10, List<Geofence> geofences) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(geofences, "geofences");
        this.id = id2;
        this.waitInterval = d10;
        this.geofences = geofences;
    }

    public final List<Geofence> a() {
        return this.geofences;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Double d10 = this.waitInterval;
        return ((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.geofences.hashCode();
    }

    public String toString() {
        return "GeofenceGroup(id=" + this.id + ", waitInterval=" + this.waitInterval + ", geofences=" + this.geofences + ")";
    }
}
