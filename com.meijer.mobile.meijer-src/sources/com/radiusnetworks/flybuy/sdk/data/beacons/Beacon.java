package com.radiusnetworks.flybuy.sdk.data.beacons;

import com.radiusnetworks.flybuy.sdk.util.Averager;
import j$.time.Instant;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\n\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/beacons/Beacon;", "", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;", "ids", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;)V", "", "isStale", "()Z", "", "rssi", "", "addScan", "(I)V", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;", "getIds", "()Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;", "Lcom/radiusnetworks/flybuy/sdk/util/Averager;", "Lcom/radiusnetworks/flybuy/sdk/util/Averager;", "getRssi$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/util/Averager;", "setRssi$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/util/Averager;)V", "j$/time/Instant", "kotlin.jvm.PlatformType", "scannedAt", "Lj$/time/Instant;", "", "getDistance", "()F", "distance", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
/* loaded from: classes12.dex */
public final class Beacon {
    private static final int ROLLING_AVG_COUNT = 10;
    private static final long STALE_SECONDS = 5;
    private final BeaconIdentifiers ids;
    private Averager rssi;
    private Instant scannedAt;

    public Beacon(BeaconIdentifiers ids) {
        Intrinsics.j(ids, "ids");
        this.ids = ids;
        this.rssi = new Averager(10);
        this.scannedAt = Instant.MIN;
    }

    public final float getDistance() {
        return (float) BeaconKt.calculateDistance(this.ids.getTxPower(), this.rssi.getValue());
    }

    public final BeaconIdentifiers getIds() {
        return this.ids;
    }

    /* renamed from: getRssi$core_defaultRelease, reason: from getter */
    public final Averager getRssi() {
        return this.rssi;
    }

    public final void setRssi$core_defaultRelease(Averager averager) {
        Intrinsics.j(averager, "<set-?>");
        this.rssi = averager;
    }

    public final void addScan(int rssi) {
        if (isStale()) {
            this.rssi = new Averager(10);
        }
        this.rssi.add(rssi);
        this.scannedAt = Instant.now();
    }

    public final boolean isStale() {
        return Instant.now().minusSeconds(STALE_SECONDS).isAfter(this.scannedAt);
    }
}
