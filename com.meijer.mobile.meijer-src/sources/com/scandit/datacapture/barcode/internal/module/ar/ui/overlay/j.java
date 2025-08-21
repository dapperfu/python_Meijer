package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final NativeDataCaptureOverlay f122168a;

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    public final NativeDataCaptureOverlay _dataCaptureOverlayImpl() {
        return this.f122168a;
    }

    public j(NativeBarcodeArOverlay _NativeBarcodeArOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodeArOverlay, "_NativeBarcodeArOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeArOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f122168a = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }
}
