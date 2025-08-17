package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"getByKeyAsAndroidColor", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "key", "", "defaultValue", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SparkScanFeedbackDeserializerKt {
    public static final int getByKeyAsAndroidColor(JsonValue jsonValue, String key, int i10) {
        Intrinsics.j(jsonValue, "<this>");
        Intrinsics.j(key, "key");
        NativeColor colorForKeyOrDefault = jsonValue.getF125830a().getColorForKeyOrDefault(key, NativeColorExtensionsKt.toNativeColor(i10));
        Intrinsics.i(colorForKeyOrDefault, "getColorForKeyOrDefault(...)");
        return NativeColorExtensionsKt.toInt(colorForKeyOrDefault);
    }
}
