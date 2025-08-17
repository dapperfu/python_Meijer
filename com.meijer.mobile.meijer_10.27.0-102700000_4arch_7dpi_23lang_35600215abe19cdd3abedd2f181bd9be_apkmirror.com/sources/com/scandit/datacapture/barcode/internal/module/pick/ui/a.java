package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePickBasicOverlay f122478a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122479b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeDataCaptureOverlay f122480c;

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF120500c() {
        return this.f122480c;
    }

    public a(NativeBarcodePickBasicOverlay _NativeBarcodePickBasicOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePickBasicOverlay, "_NativeBarcodePickBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122478a = _NativeBarcodePickBasicOverlay;
        this.f122479b = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodePickBasicOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f122480c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }
}
