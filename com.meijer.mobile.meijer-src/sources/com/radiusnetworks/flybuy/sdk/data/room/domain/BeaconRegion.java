package com.radiusnetworks.flybuy.sdk.data.room.domain;

import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "", "beaconRegion", "Lcom/radiusnetworks/flybuy/api/model/BeaconRegion;", "orderId", "", "(Lcom/radiusnetworks/flybuy/api/model/BeaconRegion;I)V", "uuid", "Ljava/util/UUID;", "major", "minor", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;I)V", PreferencesHelper.PREF_ID, "getId", "()I", "setId", "(I)V", "getMajor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinor", "getOrderId", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/lang/Integer;I)Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "equals", "", "other", "hashCode", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BeaconRegion {
    private int id;
    private final Integer major;
    private final Integer minor;
    private final int orderId;
    private final UUID uuid;

    @ExperimentalUnsignedTypes
    public BeaconRegion(UUID uuid, Integer num, Integer num2, int i10) {
        Intrinsics.j(uuid, "uuid");
        this.uuid = uuid;
        this.major = num;
        this.minor = num2;
        this.orderId = i10;
    }

    public static /* synthetic */ BeaconRegion copy$default(BeaconRegion beaconRegion, UUID uuid, Integer num, Integer num2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uuid = beaconRegion.uuid;
        }
        if ((i11 & 2) != 0) {
            num = beaconRegion.major;
        }
        if ((i11 & 4) != 0) {
            num2 = beaconRegion.minor;
        }
        if ((i11 & 8) != 0) {
            i10 = beaconRegion.orderId;
        }
        return beaconRegion.copy(uuid, num, num2, i10);
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

    /* renamed from: component4, reason: from getter */
    public final int getOrderId() {
        return this.orderId;
    }

    public final BeaconRegion copy(UUID uuid, Integer major, Integer minor, int orderId) {
        Intrinsics.j(uuid, "uuid");
        return new BeaconRegion(uuid, major, minor, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeaconRegion)) {
            return false;
        }
        BeaconRegion beaconRegion = (BeaconRegion) other;
        return Intrinsics.e(this.uuid, beaconRegion.uuid) && Intrinsics.e(this.major, beaconRegion.major) && Intrinsics.e(this.minor, beaconRegion.minor) && this.orderId == beaconRegion.orderId;
    }

    public int hashCode() {
        int iHashCode = this.uuid.hashCode() * 31;
        Integer num = this.major;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minor;
        return Integer.hashCode(this.orderId) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "BeaconRegion(uuid=" + this.uuid + ", major=" + this.major + ", minor=" + this.minor + ", orderId=" + this.orderId + ')';
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getMajor() {
        return this.major;
    }

    public final Integer getMinor() {
        return this.minor;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ExperimentalUnsignedTypes
    public BeaconRegion(com.radiusnetworks.flybuy.api.model.BeaconRegion beaconRegion, int i10) {
        this(beaconRegion.getUuid(), beaconRegion.getMajor(), beaconRegion.getMinor(), i10);
        Intrinsics.j(beaconRegion, "beaconRegion");
    }
}
