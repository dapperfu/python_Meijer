package com.scandit.datacapture.core.internal.module.gl;

import android.graphics.SurfaceTexture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final l f124631a;

    public h(l parent) {
        Intrinsics.j(parent, "parent");
        this.f124631a = parent;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Intrinsics.j(surfaceTexture, "surfaceTexture");
        l.a(this.f124631a, surfaceTexture);
        Function0 function0 = this.f124631a.f124662u;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
