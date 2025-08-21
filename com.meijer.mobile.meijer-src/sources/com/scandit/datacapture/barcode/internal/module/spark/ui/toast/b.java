package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124200d;

    public b() {
        String text = NativeSparkScanViewDefaults.defaultContinuousModeEnabledMessage();
        Intrinsics.i(text, "defaultContinuousModeEnabledMessage(...)");
        NativeColor nativeColorDefaultToastEnabledBackgroundColor = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
        Intrinsics.i(nativeColorDefaultToastEnabledBackgroundColor, "defaultToastEnabledBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor);
        Intrinsics.j(text, "text");
        this.f124199c = text;
        this.f124200d = i10;
    }
}
