package com.radiusnetworks.flybuy.api.model;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/BeaconRegion;", "", "uuid", "Ljava/util/UUID;", "major", "", "minor", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMajor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinor", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/BeaconRegion;", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeaconRegion {
    private final Integer major;
    private final Integer minor;
    private final UUID uuid;

    public BeaconRegion(UUID uuid, Integer num, Integer num2) {
        Intrinsics.j(uuid, "uuid");
        this.uuid = uuid;
        this.major = num;
        this.minor = num2;
    }

    public static /* synthetic */ BeaconRegion copy$default(BeaconRegion beaconRegion, UUID uuid, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uuid = beaconRegion.uuid;
        }
        if ((i10 & 2) != 0) {
            num = beaconRegion.major;
        }
        if ((i10 & 4) != 0) {
            num2 = beaconRegion.minor;
        }
        return beaconRegion.copy(uuid, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMajor() {
        return this.major;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMinor() {
        return this.minor;
    }

    public final BeaconRegion copy(UUID uuid, Integer major, Integer minor) {
        Intrinsics.j(uuid, "uuid");
        return new BeaconRegion(uuid, major, minor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeaconRegion)) {
            return false;
        }
        BeaconRegion beaconRegion = (BeaconRegion) other;
        return Intrinsics.e(this.uuid, beaconRegion.uuid) && Intrinsics.e(this.major, beaconRegion.major) && Intrinsics.e(this.minor, beaconRegion.minor);
    }

    public final Integer getMajor() {
        return this.major;
    }

    public final Integer getMinor() {
        return this.minor;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        Integer num = this.major;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "BeaconRegion(uuid=" + this.uuid + ", major=" + this.major + ", minor=" + this.minor + ')';
    }
}
