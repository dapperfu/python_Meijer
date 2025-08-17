package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final NativeBarcodePickSession f122455a;

    public w(NativeBarcodePickSession _NativeBarcodePickSession) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeBarcodePickSession, "_NativeBarcodePickSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f122455a = _NativeBarcodePickSession;
    }
}
