package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final NativeGestureListener f125303a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f125304b;

    public n(NativeGestureListener _NativeGestureListener) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeGestureListener, "_NativeGestureListener");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125303a = _NativeGestureListener;
    }
}
