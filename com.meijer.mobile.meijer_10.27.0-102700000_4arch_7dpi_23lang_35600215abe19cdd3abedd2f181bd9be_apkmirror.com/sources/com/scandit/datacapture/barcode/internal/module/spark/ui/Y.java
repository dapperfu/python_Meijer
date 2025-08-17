package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123039a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123039a.f123022f.g();
        return Unit.f142422a;
    }
}
