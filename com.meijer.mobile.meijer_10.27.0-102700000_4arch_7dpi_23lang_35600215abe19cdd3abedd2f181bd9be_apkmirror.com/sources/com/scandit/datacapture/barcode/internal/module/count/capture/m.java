package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodeCountSession f121297a;

    public m(NativeBarcodeCountSession _NativeBarcodeCountSession) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodeCountSession, "_NativeBarcodeCountSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121297a = _NativeBarcodeCountSession;
    }
}
