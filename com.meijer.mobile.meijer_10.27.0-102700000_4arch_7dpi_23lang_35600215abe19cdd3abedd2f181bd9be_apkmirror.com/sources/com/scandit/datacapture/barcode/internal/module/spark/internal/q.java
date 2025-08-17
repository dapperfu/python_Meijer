package com.scandit.datacapture.barcode.internal.module.spark.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanInternal f122950a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SparkScanInternal sparkScanInternal) {
        super(0);
        this.f122950a = sparkScanInternal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f122950a.b();
    }
}
