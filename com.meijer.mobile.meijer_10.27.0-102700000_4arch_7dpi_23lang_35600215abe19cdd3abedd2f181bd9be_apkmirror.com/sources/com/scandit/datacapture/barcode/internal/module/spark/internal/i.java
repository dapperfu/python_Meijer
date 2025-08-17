package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeSparkScan f122943a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NativeSparkScan nativeSparkScan) {
        super(0);
        this.f122943a = nativeSparkScan;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeSparkScanSession session = this.f122943a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
