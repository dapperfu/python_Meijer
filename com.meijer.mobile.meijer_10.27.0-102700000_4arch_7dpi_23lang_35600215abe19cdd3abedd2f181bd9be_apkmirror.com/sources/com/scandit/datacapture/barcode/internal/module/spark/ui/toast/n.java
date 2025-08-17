package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f123266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123267b;

    public n() {
        NativeColor nativeColorDefaultToastTextColor = NativeSparkScanViewDefaults.defaultToastTextColor();
        Intrinsics.i(nativeColorDefaultToastTextColor, "defaultToastTextColor(...)");
        this.f123266a = NativeColorExtensionsKt.toInt(nativeColorDefaultToastTextColor);
        NativeColor nativeColorDefaultToastBackgroundColor = NativeSparkScanViewDefaults.defaultToastBackgroundColor();
        Intrinsics.i(nativeColorDefaultToastBackgroundColor, "defaultToastBackgroundColor(...)");
        this.f123267b = NativeColorExtensionsKt.toInt(nativeColorDefaultToastBackgroundColor);
    }
}
