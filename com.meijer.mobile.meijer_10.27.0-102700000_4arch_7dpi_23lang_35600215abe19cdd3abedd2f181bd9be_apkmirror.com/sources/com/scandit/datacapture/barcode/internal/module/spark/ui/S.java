package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class S extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(SparkScanViewPresenter sparkScanViewPresenter, U u10) {
        super(0);
        this.f123015a = sparkScanViewPresenter;
        this.f123016b = u10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f123015a;
        SparkScanViewState sparkScanViewStateB = sparkScanViewPresenter.b();
        U u10 = (U) this.f123016b;
        SparkScanViewPresenter.a(sparkScanViewPresenter, sparkScanViewStateB, u10, u10);
        return Unit.f142422a;
    }
}
