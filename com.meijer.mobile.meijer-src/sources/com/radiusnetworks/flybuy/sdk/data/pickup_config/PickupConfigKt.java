package com.radiusnetworks.flybuy.sdk.data.pickup_config;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¨\u0006\u0006"}, d2 = {"toPickupConfigs", "", "", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupConfig;", "", "Lcom/radiusnetworks/flybuy/api/model/PickupConfig;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PickupConfigKt {
    public static final Map<Integer, PickupConfig> toPickupConfigs(List<com.radiusnetworks.flybuy.api.model.PickupConfig> list) {
        if (list == null) {
            return MapsKt.k();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (com.radiusnetworks.flybuy.api.model.PickupConfig pickupConfig : list) {
            Pair pairA = TuplesKt.a(Integer.valueOf(pickupConfig.getId()), new PickupConfig(pickupConfig));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }
}
