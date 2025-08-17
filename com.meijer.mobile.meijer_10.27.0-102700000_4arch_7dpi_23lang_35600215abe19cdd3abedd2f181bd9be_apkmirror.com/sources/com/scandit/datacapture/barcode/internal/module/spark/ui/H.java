package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f122998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeSparkScanScanningMode f122999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanScanningMode nativeSparkScanScanningMode) {
        super(0);
        this.f122998a = sparkScanViewPresenter;
        this.f122999b = nativeSparkScanScanningMode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparkScanViewPresenter it = this.f122998a;
        Intrinsics.i(it, "$it");
        SparkScanViewUiListener sparkScanViewUiListener = it.f123031o;
        if (sparkScanViewUiListener != null) {
            sparkScanViewUiListener.onScanningModeChange(BarcodeNativeTypeFactory.INSTANCE.convert(this.f122999b));
        }
        return Unit.f142422a;
    }
}
