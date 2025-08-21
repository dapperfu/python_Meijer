package com.radiusnetworks.flybuy.sdk.data.beacons;

import java.util.Map;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconList;", "", "()V", "beacons", "", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/BeaconIdentifiers;", "Lcom/radiusnetworks/flybuy/sdk/data/beacons/Beacon;", "getBeacons", "()Ljava/util/Map;", "addScan", "", "identifiers", "rssi", "", "removeStale", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
/* loaded from: classes12.dex */
public final class BeaconList {
    private final Map<BeaconIdentifiers, Beacon> beacons = MapsKt.D(MapsKt.k());

    public final void addScan(BeaconIdentifiers identifiers, int rssi) {
        Intrinsics.j(identifiers, "identifiers");
        if (this.beacons.get(identifiers) == null) {
            this.beacons.put(identifiers, new Beacon(identifiers));
        }
        Beacon beacon = this.beacons.get(identifiers);
        if (beacon != null) {
            beacon.addScan(rssi);
        }
    }

    public final Map<BeaconIdentifiers, Beacon> getBeacons() {
        return this.beacons;
    }

    public final void removeStale() {
        CollectionsKt.H(this.beacons.entrySet(), new Function1<Map.Entry<BeaconIdentifiers, Beacon>, Boolean>() { // from class: com.radiusnetworks.flybuy.sdk.data.beacons.BeaconList.removeStale.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<BeaconIdentifiers, Beacon> it) {
                Intrinsics.j(it, "it");
                return Boolean.valueOf(it.getValue().isStale());
            }
        });
    }
}
