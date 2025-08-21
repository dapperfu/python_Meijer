package com.scandit.datacapture.core.internal.module.gl;

import android.graphics.SurfaceTexture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final l f125583a;

    public h(l parent) {
        Intrinsics.j(parent, "parent");
        this.f125583a = parent;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Intrinsics.j(surfaceTexture, "surfaceTexture");
        l.a(this.f125583a, surfaceTexture);
        Function0 function0 = this.f125583a.f125614u;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
