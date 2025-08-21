package com.radiusnetworks.flybuy.sdk.data.pickup_config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toPickupTypeConfigs", "", "Lcom/radiusnetworks/flybuy/sdk/data/pickup_config/PickupTypeConfig;", "Lcom/radiusnetworks/flybuy/api/model/PickupTypeConfig;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PickupTypeConfigKt {
    public static final List<PickupTypeConfig> toPickupTypeConfigs(List<com.radiusnetworks.flybuy.api.model.PickupTypeConfig> list) {
        if (list == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PickupTypeConfig((com.radiusnetworks.flybuy.api.model.PickupTypeConfig) it.next()));
        }
        return arrayList;
    }
}
