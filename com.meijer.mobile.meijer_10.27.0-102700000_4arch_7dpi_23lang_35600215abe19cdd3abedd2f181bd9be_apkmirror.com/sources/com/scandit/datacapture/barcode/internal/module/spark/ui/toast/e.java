package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123253c;

    public e() {
        String text = NativeSparkScanViewDefaults.defaultScanPausedMessage();
        Intrinsics.i(text, "defaultScanPausedMessage(...)");
        Intrinsics.j(text, "text");
        this.f123253c = text;
    }
}
