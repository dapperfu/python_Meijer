package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePickBasicOverlay f123430a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f123431b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeDataCaptureOverlay f123432c;

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF121452c() {
        return this.f123432c;
    }

    public a(NativeBarcodePickBasicOverlay _NativeBarcodePickBasicOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePickBasicOverlay, "_NativeBarcodePickBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123430a = _NativeBarcodePickBasicOverlay;
        this.f123431b = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodePickBasicOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f123432c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }
}
