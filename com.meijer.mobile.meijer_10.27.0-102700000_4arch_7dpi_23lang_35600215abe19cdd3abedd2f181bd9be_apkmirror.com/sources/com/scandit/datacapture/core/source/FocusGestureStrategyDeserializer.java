package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/source/FocusGestureStrategyDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FocusGestureStrategyDeserializer {
    public static final FocusGestureStrategyDeserializer INSTANCE = new FocusGestureStrategyDeserializer();

    @JvmStatic
    public static final FocusGestureStrategy fromJson(String json) {
        Intrinsics.j(json, "json");
        FocusGestureStrategy focusGestureStrategyFocusGestureStrategyFromJsonString = NativeEnumDeserializer.focusGestureStrategyFromJsonString(json);
        Intrinsics.i(focusGestureStrategyFocusGestureStrategyFromJsonString, "focusGestureStrategyFromJsonString(...)");
        return focusGestureStrategyFocusGestureStrategyFromJsonString;
    }

    private FocusGestureStrategyDeserializer() {
    }
}
