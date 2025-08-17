package com.radiusnetworks.flybuy.sdk.data.beacons;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;", "", "uuid", "Ljava/util/UUID;", "major", "", "minor", "txPower", "(Ljava/util/UUID;III)V", "getMajor", "()I", "getMinor", "getTxPower", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeaconIdentifiers {
    private final int major;
    private final int minor;
    private final int txPower;
    private final UUID uuid;

    public static /* synthetic */ BeaconIdentifiers copy$default(BeaconIdentifiers beaconIdentifiers, UUID uuid, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = beaconIdentifiers.uuid;
        }
        if ((i13 & 2) != 0) {
            i10 = beaconIdentifiers.major;
        }
        if ((i13 & 4) != 0) {
            i11 = beaconIdentifiers.minor;
        }
        if ((i13 & 8) != 0) {
            i12 = beaconIdentifiers.txPower;
        }
        return beaconIdentifiers.copy(uuid, i10, i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTxPower() {
        return this.txPower;
    }

    public final BeaconIdentifiers copy(UUID uuid, int major, int minor, int txPower) {
        Intrinsics.j(uuid, "uuid");
        return new BeaconIdentifiers(uuid, major, minor, txPower);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeaconIdentifiers)) {
            return false;
        }
        BeaconIdentifiers beaconIdentifiers = (BeaconIdentifiers) other;
        return Intrinsics.e(this.uuid, beaconIdentifiers.uuid) && this.major == beaconIdentifiers.major && this.minor == beaconIdentifiers.minor && this.txPower == beaconIdentifiers.txPower;
    }

    public int hashCode() {
        return Integer.hashCode(this.txPower) + ((Integer.hashCode(this.minor) + ((Integer.hashCode(this.major) + (this.uuid.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BeaconIdentifiers(uuid=" + this.uuid + ", major=" + this.major + ", minor=" + this.minor + ", txPower=" + this.txPower + ')';
    }

    public BeaconIdentifiers(UUID uuid, int i10, int i11, int i12) {
        Intrinsics.j(uuid, "uuid");
        this.uuid = uuid;
        this.major = i10;
        this.minor = i11;
        this.txPower = i12;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getTxPower() {
        return this.txPower;
    }

    public final UUID getUuid() {
        return this.uuid;
    }
}
