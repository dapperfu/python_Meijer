package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class W extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123988a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(SparkScanViewPresenter sparkScanViewPresenter) {
        super(1);
        this.f123988a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        SparkScanViewPresenter sparkScanViewPresenter = this.f123988a;
        sparkScanViewPresenter.a(new V(sparkScanViewPresenter));
        return Unit.f143329a;
    }
}
