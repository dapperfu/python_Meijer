package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class T extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123033a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123033a.f123022f.g();
        return Unit.f142422a;
    }
}
