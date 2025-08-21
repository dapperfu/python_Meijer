package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f124206c;

    public f() {
        String text = NativeSparkScanViewDefaults.defaultTargetModeDisabledMessage();
        Intrinsics.i(text, "defaultTargetModeDisabledMessage(...)");
        Intrinsics.j(text, "text");
        this.f124206c = text;
    }
}
