package com.radiusnetworks.flybuy.sdk.data.beacons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"calculateDistance", "", "txPower", "", "rssi", "toApiBeacon", "Lcom/radiusnetworks/flybuy/api/model/Beacon;", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/Beacon;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BeaconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final double calculateDistance(int i10, double d10) {
        if (d10 == 0.0d) {
            return -1.0d;
        }
        return Math.pow(10.0d, (i10 - d10) / (10 * 2.0d));
    }

    @ExperimentalUnsignedTypes
    public static final com.radiusnetworks.flybuy.api.model.Beacon toApiBeacon(Beacon beacon) {
        Intrinsics.j(beacon, "<this>");
        return new com.radiusnetworks.flybuy.api.model.Beacon(beacon.getIds().getUuid(), UInt.b(beacon.getIds().getMajor()), UInt.b(beacon.getIds().getMinor()), beacon.getRssi$core_defaultRelease().getValue(), beacon.getDistance(), null);
    }
}
