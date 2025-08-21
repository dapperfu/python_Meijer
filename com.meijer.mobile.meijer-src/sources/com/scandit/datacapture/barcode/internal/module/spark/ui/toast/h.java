package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124209c;

    public h() {
        String text = NativeSparkScanViewDefaults.defaultTorchDisabledMessage();
        Intrinsics.i(text, "defaultTorchDisabledMessage(...)");
        Intrinsics.j(text, "text");
        this.f124209c = text;
    }
}
