package com.scandit.datacapture.core.ui.style;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/BrushSerializer;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "", "toJson", "(Lcom/scandit/datacapture/core/ui/style/Brush;)Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BrushSerializer {
    public static final BrushSerializer INSTANCE = new BrushSerializer();

    @JvmStatic
    public static final String toJson(Brush brush) {
        Intrinsics.j(brush, "brush");
        String strBrushToJson = NativeStructSerializer.brushToJson(new NativeBrush(NativeColorExtensionsKt.toNativeColor(brush.getFillColor()), NativeColorExtensionsKt.toNativeColor(brush.getStrokeColor()), brush.getStrokeWidth()));
        Intrinsics.i(strBrushToJson, "brushToJson(...)");
        return strBrushToJson;
    }

    private BrushSerializer() {
    }
}
