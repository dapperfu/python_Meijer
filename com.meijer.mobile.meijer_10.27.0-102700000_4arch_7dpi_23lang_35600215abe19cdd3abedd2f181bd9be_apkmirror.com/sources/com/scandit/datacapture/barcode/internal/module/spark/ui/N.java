package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class N extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(SparkScanViewPresenter sparkScanViewPresenter) {
        super(0);
        this.f123011a = sparkScanViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewUiListener sparkScanViewUiListener = this.f123011a.f123031o;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onBarcodeCountButtonTap(this.f123011a.f123017a);
        }
        return Unit.f142422a;
    }
}
