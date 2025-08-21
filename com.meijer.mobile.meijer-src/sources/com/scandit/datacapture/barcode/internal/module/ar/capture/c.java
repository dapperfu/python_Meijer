package com.scandit.datacapture.barcode.internal.module.ar.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodeAr f122012a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeDataCaptureMode f122013b;

    public c(NativeBarcodeAr _NativeBarcodeAr) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodeAr, "_NativeBarcodeAr");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122012a = _NativeBarcodeAr;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodeAr.asDataCaptureMode();
        Intrinsics.i(nativeDataCaptureModeAsDataCaptureMode, "asDataCaptureMode(...)");
        this.f122013b = nativeDataCaptureModeAsDataCaptureMode;
    }
}
