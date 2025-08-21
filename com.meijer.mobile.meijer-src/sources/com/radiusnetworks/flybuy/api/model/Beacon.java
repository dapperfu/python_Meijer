package com.radiusnetworks.flybuy.api.model;

import java.util.UUID;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Beacon;", "", "uuid", "Ljava/util/UUID;", "major", "Lkotlin/UInt;", "minor", "rssi", "", "distance", "(Ljava/util/UUID;IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDistance", "()F", "getMajor-pVg5ArA", "()I", "I", "getMinor-pVg5ArA", "getRssi", "getUuid", "()Ljava/util/UUID;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
/* loaded from: classes12.dex */
public final class Beacon {
    private final float distance;
    private final int major;
    private final int minor;
    private final float rssi;
    private final UUID uuid;

    public /* synthetic */ Beacon(UUID uuid, int i10, int i11, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, i10, i11, f10, f11);
    }

    private Beacon(UUID uuid, int i10, int i11, float f10, float f11) {
        Intrinsics.j(uuid, "uuid");
        this.uuid = uuid;
        this.major = i10;
        this.minor = i11;
        this.rssi = f10;
        this.distance = f11;
    }

    public final float getDistance() {
        return this.distance;
    }

    /* renamed from: getMajor-pVg5ArA, reason: not valid java name and from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: getMinor-pVg5ArA, reason: not valid java name and from getter */
    public final int getMinor() {
        return this.minor;
    }

    public final float getRssi() {
        return this.rssi;
    }

    public final UUID getUuid() {
        return this.uuid;
    }
}
