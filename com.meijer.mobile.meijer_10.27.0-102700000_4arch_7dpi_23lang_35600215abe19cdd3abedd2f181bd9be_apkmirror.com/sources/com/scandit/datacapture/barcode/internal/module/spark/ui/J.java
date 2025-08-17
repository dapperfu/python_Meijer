package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class J extends NativeSparkScanViewUiListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123002a;

    public J(SparkScanViewPresenter owner) {
        Intrinsics.j(owner, "owner");
        this.f123002a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewUiListener
    public final void onScanningModeChanged(NativeSparkScanScanningMode previousMode, NativeSparkScanScanningMode newMode) {
        Intrinsics.j(previousMode, "previousMode");
        Intrinsics.j(newMode, "newMode");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) this.f123002a.get();
        if (sparkScanViewPresenter != null) {
            sparkScanViewPresenter.a(new H(sparkScanViewPresenter, newMode));
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewUiListener
    public final void onViewStateChanged(SparkScanViewState newState) {
        Intrinsics.j(newState, "newState");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) this.f123002a.get();
        if (sparkScanViewPresenter != null) {
            sparkScanViewPresenter.a(new I(sparkScanViewPresenter, newState));
        }
    }
}
