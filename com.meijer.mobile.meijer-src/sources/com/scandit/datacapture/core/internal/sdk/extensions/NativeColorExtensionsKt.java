package com.scandit.datacapture.core.internal.sdk.extensions;

import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toInt", "", "Lcom/scandit/datacapture/core/internal/sdk/common/graphics/NativeColor;", "toNativeColor", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeColorExtensionsKt {
    public static final int toInt(NativeColor nativeColor) {
        Intrinsics.j(nativeColor, "<this>");
        c cVar = c.f126424a;
        int iIntValue = ((Number) cVar.invoke(Float.valueOf(nativeColor.getA()))).intValue() << 24;
        int iIntValue2 = ((Number) cVar.invoke(Float.valueOf(nativeColor.getR()))).intValue() << 16;
        return ((Number) cVar.invoke(Float.valueOf(nativeColor.getB()))).intValue() | iIntValue | iIntValue2 | (((Number) cVar.invoke(Float.valueOf(nativeColor.getG()))).intValue() << 8);
    }

    public static final NativeColor toNativeColor(int i10) {
        d dVar = d.f126425a;
        return new NativeColor(((Number) dVar.invoke(Integer.valueOf((16711680 & i10) >>> 16))).floatValue(), ((Number) dVar.invoke(Integer.valueOf((65280 & i10) >>> 8))).floatValue(), ((Number) dVar.invoke(Integer.valueOf(i10 & l3.f93323c))).floatValue(), ((Number) dVar.invoke(Integer.valueOf(((-16777216) & i10) >>> 24))).floatValue());
    }
}
