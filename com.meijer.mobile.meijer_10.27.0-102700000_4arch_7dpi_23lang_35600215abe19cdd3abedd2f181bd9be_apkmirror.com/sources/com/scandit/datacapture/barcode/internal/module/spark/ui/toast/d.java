package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f123251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f123252e;

    public d(String text) {
        NativeColor nativeColorDefaultErrorToastBackgroundColor = NativeSparkScanViewDefaults.defaultErrorToastBackgroundColor();
        Intrinsics.i(nativeColorDefaultErrorToastBackgroundColor, "defaultErrorToastBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(nativeColorDefaultErrorToastBackgroundColor);
        NativeColor nativeColorDefaultErrorToastTextColor = NativeSparkScanViewDefaults.defaultErrorToastTextColor();
        Intrinsics.i(nativeColorDefaultErrorToastTextColor, "defaultErrorToastTextColor(...)");
        int i11 = NativeColorExtensionsKt.toInt(nativeColorDefaultErrorToastTextColor);
        Intrinsics.j(text, "text");
        this.f123250c = text;
        this.f123251d = i10;
        this.f123252e = i11;
    }
}
