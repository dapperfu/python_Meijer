package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124213d;

    public j() {
        String text = NativeSparkScanViewDefaults.defaultUserFacingCameraEnabledMessage();
        Intrinsics.i(text, "defaultUserFacingCameraEnabledMessage(...)");
        NativeColor nativeColorDefaultToastEnabledBackgroundColor = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
        Intrinsics.i(nativeColorDefaultToastEnabledBackgroundColor, "defaultToastEnabledBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor);
        Intrinsics.j(text, "text");
        this.f124212c = text;
        this.f124213d = i10;
    }
}
