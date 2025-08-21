package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class G extends NativeSparkScanViewHandlerDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final F f123949a;

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate
    public final void onStateTransition(SparkScanViewState currentState) {
        Intrinsics.j(currentState, "state");
        L l10 = (L) this.f123949a;
        l10.getClass();
        Intrinsics.j(currentState, "currentState");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) l10.f123956a.get();
        if (sparkScanViewPresenter != null) {
            sparkScanViewPresenter.c(currentState);
        }
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewHandlerDelegate
    public final void resetAllTimers() {
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((L) this.f123949a).f123956a.get();
        if (sparkScanViewPresenter != null) {
            SparkScanViewPresenter.k(sparkScanViewPresenter);
        }
    }

    public G(L _SparkScanViewHandlerDelegate) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_SparkScanViewHandlerDelegate, "_SparkScanViewHandlerDelegate");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123949a = _SparkScanViewHandlerDelegate;
    }
}
