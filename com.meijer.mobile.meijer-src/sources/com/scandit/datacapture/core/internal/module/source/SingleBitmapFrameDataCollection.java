package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class SingleBitmapFrameDataCollection {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSingleBitmapFrameDataCollection f125769a;

    public final NativeSingleBitmapFrameDataCollection a() {
        return this.f125769a;
    }

    public SingleBitmapFrameDataCollection(NativeSingleBitmapFrameDataCollection _NativeSingleBitmapFrameDataCollection) {
        this.f125769a = _NativeSingleBitmapFrameDataCollection;
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_NativeSingleBitmapFrameDataCollection, "_NativeSingleBitmapFrameDataCollection");
        Intrinsics.j(proxyCache, "proxyCache");
    }
}
