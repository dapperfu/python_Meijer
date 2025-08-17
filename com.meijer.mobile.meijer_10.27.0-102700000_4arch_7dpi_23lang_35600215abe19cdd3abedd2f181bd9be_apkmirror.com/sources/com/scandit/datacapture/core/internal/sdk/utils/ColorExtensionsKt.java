package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.json.NativeColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toColorJsonValue", "", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorExtensionsKt {
    public static final String toColorJsonValue(int i10) {
        String strColorAsStringForSerialization = NativeColorUtils.colorAsStringForSerialization(NativeColorExtensionsKt.toNativeColor(i10));
        Intrinsics.i(strColorAsStringForSerialization, "colorAsStringForSerialization(...)");
        return strColorAsStringForSerialization;
    }
}
