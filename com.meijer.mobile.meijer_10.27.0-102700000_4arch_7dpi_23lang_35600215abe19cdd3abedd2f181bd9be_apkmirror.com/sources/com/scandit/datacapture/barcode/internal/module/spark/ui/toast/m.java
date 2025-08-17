package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class m extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f123265c;

    public m() {
        String text = NativeSparkScanViewDefaults.defaultZoomedOutMessage();
        Intrinsics.i(text, "defaultZoomedOutMessage(...)");
        Intrinsics.j(text, "text");
        this.f123265c = text;
    }
}
