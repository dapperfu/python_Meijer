package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(SparkScanViewPresenter sparkScanViewPresenter) {
        super(1);
        this.f123966a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        SparkScanViewPresenter sparkScanViewPresenter = this.f123966a;
        sparkScanViewPresenter.a(new P(sparkScanViewPresenter));
        return Unit.f143329a;
    }
}
