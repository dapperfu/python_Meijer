package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class U extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123034a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123034a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f123034a;
        sparkScanViewPresenter.a(new T(sparkScanViewPresenter));
        return Unit.f142422a;
    }
}
