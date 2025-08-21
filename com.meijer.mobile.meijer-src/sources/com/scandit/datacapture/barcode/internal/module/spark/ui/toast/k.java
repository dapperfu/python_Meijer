package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124214c;

    public k() {
        String text = NativeSparkScanViewDefaults.defaultWorldFacingCameraEnabledMessage();
        Intrinsics.i(text, "defaultWorldFacingCameraEnabledMessage(...)");
        Intrinsics.j(text, "text");
        this.f124214c = text;
    }
}
