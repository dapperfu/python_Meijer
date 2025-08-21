package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodeFindBasicOverlay f123208a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeDataCaptureOverlay f123209b;

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void a(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void b(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void c(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void d(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void e(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void f(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void g(String str) {
        throw null;
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    public final NativeDataCaptureOverlay _dataCaptureOverlayImpl() {
        return this.f123209b;
    }

    public d(NativeBarcodeFindBasicOverlay _NativeBarcodeFindBasicOverlay) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodeFindBasicOverlay, "_NativeBarcodeFindBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123208a = _NativeBarcodeFindBasicOverlay;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeFindBasicOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f123209b = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }
}
