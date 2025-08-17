package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.internal.module.source.NativeRegionStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/source/RegionStrategySerializer;", "", "Lcom/scandit/datacapture/core/internal/module/source/NativeRegionStrategy;", "regionStrategy", "", "toJson", "(Lcom/scandit/datacapture/core/internal/module/source/NativeRegionStrategy;)Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RegionStrategySerializer {
    public static final RegionStrategySerializer INSTANCE = new RegionStrategySerializer();

    public final String toJson(NativeRegionStrategy regionStrategy) {
        Intrinsics.j(regionStrategy, "regionStrategy");
        Intrinsics.j(regionStrategy, "<this>");
        String strRegionStrategyToString = NativeEnumSerializer.regionStrategyToString(regionStrategy);
        Intrinsics.i(strRegionStrategyToString, "regionStrategyToString(...)");
        return strRegionStrategyToString;
    }

    private RegionStrategySerializer() {
    }
}
