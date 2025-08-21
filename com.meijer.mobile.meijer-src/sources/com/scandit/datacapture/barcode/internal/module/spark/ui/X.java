package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class X extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewState f123990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        super(0);
        this.f123989a = sparkScanViewPresenter;
        this.f123990b = sparkScanViewState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter.c(this.f123989a, this.f123990b);
        SparkScanViewPresenter.b(this.f123989a, this.f123990b);
        SparkScanViewPresenter.a(this.f123989a, this.f123990b);
        this.f123989a.d(this.f123990b);
        return Unit.f143329a;
    }
}
