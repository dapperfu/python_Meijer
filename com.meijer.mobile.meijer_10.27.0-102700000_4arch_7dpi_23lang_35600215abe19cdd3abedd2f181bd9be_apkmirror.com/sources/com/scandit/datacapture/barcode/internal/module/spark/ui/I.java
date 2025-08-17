package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewState f123001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        super(0);
        this.f123000a = sparkScanViewPresenter;
        this.f123001b = sparkScanViewState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter it = this.f123000a;
        Intrinsics.i(it, "$it");
        SparkScanViewUiListener sparkScanViewUiListener = it.f123031o;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onViewStateChanged(this.f123001b);
        }
        return Unit.f142422a;
    }
}
