package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f125232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DataCaptureTextureView dataCaptureTextureView) {
        super(1);
        this.f125232a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        SurfaceTexture surfaceTexture = this.f125232a.getSurfaceTexture();
        if (surfaceTexture == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.i(surfaceTexture, "checkNotNull(...)");
        use.a(surfaceTexture, new e(this.f125232a), new f(this.f125232a), this.f125232a.f125130a.get_optimizesRendering(), new g(this.f125232a));
        return Unit.f142422a;
    }
}
