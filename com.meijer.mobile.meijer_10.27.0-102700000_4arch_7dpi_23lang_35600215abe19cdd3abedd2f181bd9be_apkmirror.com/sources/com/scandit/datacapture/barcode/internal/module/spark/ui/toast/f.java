package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123254c;

    public f() {
        String text = NativeSparkScanViewDefaults.defaultTargetModeDisabledMessage();
        Intrinsics.i(text, "defaultTargetModeDisabledMessage(...)");
        Intrinsics.j(text, "text");
        this.f123254c = text;
    }
}
