package Dh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\n¨\u0006\u0016"}, d2 = {"LDh/H;", "", "", "vehicleId", "", "oldVehicleDescription", "newVehicleDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.H, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class VehicleDescriptionChangeInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vehicleId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oldVehicleDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String newVehicleDescription;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDescriptionChangeInfo)) {
            return false;
        }
        VehicleDescriptionChangeInfo vehicleDescriptionChangeInfo = (VehicleDescriptionChangeInfo) other;
        return this.vehicleId == vehicleDescriptionChangeInfo.vehicleId && Intrinsics.e(this.oldVehicleDescription, vehicleDescriptionChangeInfo.oldVehicleDescription) && Intrinsics.e(this.newVehicleDescription, vehicleDescriptionChangeInfo.newVehicleDescription);
    }

    /* renamed from: a, reason: from getter */
    public final String getNewVehicleDescription() {
        return this.newVehicleDescription;
    }

    /* renamed from: b, reason: from getter */
    public final String getOldVehicleDescription() {
        return this.oldVehicleDescription;
    }

    /* renamed from: c, reason: from getter */
    public final int getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.vehicleId) * 31;
        String str = this.oldVehicleDescription;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newVehicleDescription;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VehicleDescriptionChangeInfo(vehicleId=" + this.vehicleId + ", oldVehicleDescription=" + this.oldVehicleDescription + ", newVehicleDescription=" + this.newVehicleDescription + ')';
    }

    public VehicleDescriptionChangeInfo(int i10, String str, String str2) {
        this.vehicleId = i10;
        this.oldVehicleDescription = str;
        this.newVehicleDescription = str2;
    }
}
