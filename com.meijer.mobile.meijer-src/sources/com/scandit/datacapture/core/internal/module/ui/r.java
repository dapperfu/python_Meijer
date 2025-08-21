package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class r extends NativeGestureRecognizer {

    /* renamed from: a, reason: collision with root package name */
    public final GestureRecognizer f126264a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f126265b;

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureRecognizer
    public final void setGestureListener(NativeGestureListener listener, EnumSet gestures) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(gestures, "gestures");
        this.f126264a.a((GestureListener) this.f126265b.getOrPut(Reflection.b(NativeGestureListener.class), null, listener, new q(listener)), gestures);
    }

    public r(GestureRecognizer _GestureRecognizer) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_GestureRecognizer, "_GestureRecognizer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126264a = _GestureRecognizer;
        this.f126265b = proxyCache;
    }
}
