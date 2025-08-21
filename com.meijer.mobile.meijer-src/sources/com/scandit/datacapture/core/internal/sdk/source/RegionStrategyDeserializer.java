package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeRegionStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/source/RegionStrategyDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/internal/module/source/NativeRegionStrategy;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/source/NativeRegionStrategy;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class RegionStrategyDeserializer {
    public static final RegionStrategyDeserializer INSTANCE = new RegionStrategyDeserializer();

    public final NativeRegionStrategy fromJson(String json) {
        Intrinsics.j(json, "json");
        NativeRegionStrategy nativeRegionStrategyRegionStrategyFromJsonString = NativeEnumDeserializer.regionStrategyFromJsonString(json);
        Intrinsics.i(nativeRegionStrategyRegionStrategyFromJsonString, "regionStrategyFromJsonString(...)");
        return nativeRegionStrategyRegionStrategyFromJsonString;
    }

    private RegionStrategyDeserializer() {
    }
}
