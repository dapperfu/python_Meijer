package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f126246a;

    public i(DataCaptureTextureView dataCaptureTextureView) {
        this.f126246a = dataCaptureTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.j(surface, "surface");
        DataCaptureTextureView.e(this.f126246a);
        this.f126246a.f126082a.onSurfaceTextureAvailable$scandit_capture_core();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.j(surface, "surface");
        DataCaptureTextureView.b(this.f126246a, surface);
        this.f126246a.f126082a.onSurfaceTextureDestroyed$scandit_capture_core();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.j(surface, "surface");
        DataCaptureTextureView.a(this.f126246a, surface);
        this.f126246a.f126082a._setNeedsRedraw();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.j(surface, "surface");
        this.f126246a.f126082a.onSurfaceTextureUpdated$scandit_capture_core();
    }
}
