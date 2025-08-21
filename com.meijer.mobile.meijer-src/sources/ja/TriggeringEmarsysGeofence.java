package ja;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lja/c;", "", "", "geofenceId", "LZ9/c;", "triggerType", "<init>", "(Ljava/lang/String;LZ9/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LZ9/c;", "()LZ9/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ja.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class TriggeringEmarsysGeofence {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String geofenceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Z9.c triggerType;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggeringEmarsysGeofence)) {
            return false;
        }
        TriggeringEmarsysGeofence triggeringEmarsysGeofence = (TriggeringEmarsysGeofence) other;
        return Intrinsics.e(this.geofenceId, triggeringEmarsysGeofence.geofenceId) && this.triggerType == triggeringEmarsysGeofence.triggerType;
    }

    public TriggeringEmarsysGeofence(String geofenceId, Z9.c triggerType) {
        Intrinsics.j(geofenceId, "geofenceId");
        Intrinsics.j(triggerType, "triggerType");
        this.geofenceId = geofenceId;
        this.triggerType = triggerType;
    }

    /* renamed from: a, reason: from getter */
    public final String getGeofenceId() {
        return this.geofenceId;
    }

    /* renamed from: b, reason: from getter */
    public final Z9.c getTriggerType() {
        return this.triggerType;
    }

    public int hashCode() {
        return (this.geofenceId.hashCode() * 31) + this.triggerType.hashCode();
    }

    public String toString() {
        return "TriggeringEmarsysGeofence(geofenceId=" + this.geofenceId + ", triggerType=" + this.triggerType + ")";
    }
}
