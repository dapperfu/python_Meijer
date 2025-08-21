package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.internal.module.spark.ui.K;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.d0;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class p extends NativeSparkScanToastPresenterDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final o f124220a;

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final CameraPosition getCameraPosition() {
        CameraPosition cameraPositionB;
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((K) this.f124220a).f123955a.get();
        return (sparkScanViewPresenter == null || (cameraPositionB = SparkScanViewPresenter.b(sparkScanViewPresenter)) == null) ? d0.f124070a : cameraPositionB;
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final TorchState getTorchState() {
        TorchState torchStateG;
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((K) this.f124220a).f123955a.get();
        return (sparkScanViewPresenter == null || (torchStateG = SparkScanViewPresenter.g(sparkScanViewPresenter)) == null) ? d0.f124071b : torchStateG;
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isCameraZoomedIn() {
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((K) this.f124220a).f123955a.get();
        if (sparkScanViewPresenter != null) {
            return SparkScanViewPresenter.h(sparkScanViewPresenter);
        }
        return false;
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isLongPressing() {
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((K) this.f124220a).f123955a.get();
        if (sparkScanViewPresenter != null) {
            return SparkScanViewPresenter.i(sparkScanViewPresenter);
        }
        return false;
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final boolean isPersistentPreview() {
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) ((K) this.f124220a).f123955a.get();
        if (sparkScanViewPresenter != null) {
            return SparkScanViewPresenter.j(sparkScanViewPresenter);
        }
        return false;
    }

    @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastPresenterDelegate
    public final void showToast(NativeSparkScanToastType toast) {
        Intrinsics.j(toast, "toast");
        K k10 = (K) this.f124220a;
        k10.getClass();
        Intrinsics.j(toast, "toast");
        SparkScanViewPresenter sparkScanViewPresenter = (SparkScanViewPresenter) k10.f123955a.get();
        if (sparkScanViewPresenter != null) {
            SparkScanViewPresenter.a(sparkScanViewPresenter, toast);
        }
    }

    public p(K _SparkScanToastPresenterDelegate) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_SparkScanToastPresenterDelegate, "_SparkScanToastPresenterDelegate");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124220a = _SparkScanToastPresenterDelegate;
    }
}
