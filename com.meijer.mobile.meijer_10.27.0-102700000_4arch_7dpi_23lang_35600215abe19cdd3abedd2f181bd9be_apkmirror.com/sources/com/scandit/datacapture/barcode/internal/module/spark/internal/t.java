package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final NativeSparkScan f122955a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeDataCaptureMode f122956b;

    public t(NativeSparkScan _NativeSparkScan) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeSparkScan, "_NativeSparkScan");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122955a = _NativeSparkScan;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeSparkScan.asDataCaptureMode();
        Intrinsics.i(nativeDataCaptureModeAsDataCaptureMode, "asDataCaptureMode(...)");
        this.f122956b = nativeDataCaptureModeAsDataCaptureMode;
    }
}
