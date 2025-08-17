package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123246c;

    public a() {
        String text = NativeSparkScanViewDefaults.defaultContinuousModeDisabledMessage();
        Intrinsics.i(text, "defaultContinuousModeDisabledMessage(...)");
        Intrinsics.j(text, "text");
        this.f123246c = text;
    }
}
