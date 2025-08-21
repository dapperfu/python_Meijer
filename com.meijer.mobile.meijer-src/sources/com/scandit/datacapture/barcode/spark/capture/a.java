package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f124841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function0 function0) {
        super(0);
        this.f124841a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SparkScanSessionProxyAdapter((NativeSparkScanSession) this.f124841a.invoke(), null, 2, null);
    }
}
