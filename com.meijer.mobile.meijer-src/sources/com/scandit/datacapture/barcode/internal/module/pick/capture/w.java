package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePickSession f123407a;

    public w(NativeBarcodePickSession _NativeBarcodePickSession) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePickSession, "_NativeBarcodePickSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123407a = _NativeBarcodePickSession;
    }
}
