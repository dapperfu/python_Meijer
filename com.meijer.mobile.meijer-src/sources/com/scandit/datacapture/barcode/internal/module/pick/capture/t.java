package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePick f123401a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f123402b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeDataCaptureMode f123403c;

    public t(NativeBarcodePick _NativeBarcodePick) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePick, "_NativeBarcodePick");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123401a = _NativeBarcodePick;
        this.f123402b = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodePick.asDataCaptureMode();
        Intrinsics.i(nativeDataCaptureModeAsDataCaptureMode, "asDataCaptureMode(...)");
        this.f123403c = nativeDataCaptureModeAsDataCaptureMode;
    }
}
