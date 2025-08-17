package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePick f122449a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f122450b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeDataCaptureMode f122451c;

    public t(NativeBarcodePick _NativeBarcodePick) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePick, "_NativeBarcodePick");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122449a = _NativeBarcodePick;
        this.f122450b = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodePick.asDataCaptureMode();
        Intrinsics.i(nativeDataCaptureModeAsDataCaptureMode, "asDataCaptureMode(...)");
        this.f122451c = nativeDataCaptureModeAsDataCaptureMode;
    }
}
