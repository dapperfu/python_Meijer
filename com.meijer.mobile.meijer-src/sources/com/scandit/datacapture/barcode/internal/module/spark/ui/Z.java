package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123992a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter sparkScanViewPresenter = this.f123992a;
        sparkScanViewPresenter.a(new Y(sparkScanViewPresenter));
        return Unit.f143329a;
    }
}
