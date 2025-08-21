package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewState f123953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        super(0);
        this.f123952a = sparkScanViewPresenter;
        this.f123953b = sparkScanViewState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter it = this.f123952a;
        Intrinsics.i(it, "$it");
        SparkScanViewUiListener sparkScanViewUiListener = it.f123983o;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onViewStateChanged(this.f123953b);
        }
        return Unit.f143329a;
    }
}
