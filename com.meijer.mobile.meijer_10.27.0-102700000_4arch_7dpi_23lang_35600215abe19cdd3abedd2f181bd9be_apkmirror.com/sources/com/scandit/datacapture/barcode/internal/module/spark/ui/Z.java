package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123040a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123040a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f123040a;
        sparkScanViewPresenter.a(new Y(sparkScanViewPresenter));
        return Unit.f142422a;
    }
}
