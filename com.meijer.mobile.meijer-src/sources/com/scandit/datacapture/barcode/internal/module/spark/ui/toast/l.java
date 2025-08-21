package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class l extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124216d;

    public l() {
        String text = NativeSparkScanViewDefaults.defaultZoomedInMessage();
        Intrinsics.i(text, "defaultZoomedInMessage(...)");
        NativeColor nativeColorDefaultToastEnabledBackgroundColor = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
        Intrinsics.i(nativeColorDefaultToastEnabledBackgroundColor, "defaultToastEnabledBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor);
        Intrinsics.j(text, "text");
        this.f124215c = text;
        this.f124216d = i10;
    }
}
