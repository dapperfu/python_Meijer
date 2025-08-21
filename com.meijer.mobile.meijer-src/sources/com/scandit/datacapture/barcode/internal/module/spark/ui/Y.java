package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123991a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123991a.f123974f.g();
        return Unit.f143329a;
    }
}
