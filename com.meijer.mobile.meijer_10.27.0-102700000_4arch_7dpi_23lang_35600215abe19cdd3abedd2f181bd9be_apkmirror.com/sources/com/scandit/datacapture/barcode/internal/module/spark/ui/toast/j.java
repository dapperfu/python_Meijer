package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123260c;

    /* renamed from: d, reason: collision with root package name */
    public final int f123261d;

    public j() {
        String text = NativeSparkScanViewDefaults.defaultUserFacingCameraEnabledMessage();
        Intrinsics.i(text, "defaultUserFacingCameraEnabledMessage(...)");
        NativeColor nativeColorDefaultToastEnabledBackgroundColor = NativeSparkScanViewDefaults.defaultToastEnabledBackgroundColor();
        Intrinsics.i(nativeColorDefaultToastEnabledBackgroundColor, "defaultToastEnabledBackgroundColor(...)");
        int i10 = NativeColorExtensionsKt.toInt(nativeColorDefaultToastEnabledBackgroundColor);
        Intrinsics.j(text, "text");
        this.f123260c = text;
        this.f123261d = i10;
    }
}
