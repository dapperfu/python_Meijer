package com.scandit.datacapture.core.ui.style;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/BrushDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/ui/style/Brush;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/style/Brush;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BrushDeserializer {
    public static final BrushDeserializer INSTANCE = new BrushDeserializer();

    @JvmStatic
    public static final Brush fromJson(String json) {
        Intrinsics.j(json, "json");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeBrush nativeBrushBrushFromJson = NativeStructDeserializer.brushFromJson(NativeJsonValue.fromString(json));
        Intrinsics.i(nativeBrushBrushFromJson, "brushFromJson(...)");
        return coreNativeTypeFactory.convert(nativeBrushBrushFromJson);
    }

    private BrushDeserializer() {
    }
}
