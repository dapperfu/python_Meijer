package com.scandit.datacapture.core.logger;

import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0004\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "", "", "isRenderingFrames", "isFrameSourceConnected", "choreographerRequestInProcess", "previewSurfaceSet", "", "previousRenderedFrameTimeNanos", "", "glRenderThreadSubscriptions", "Landroid/view/Choreographer;", "choreographer", "Landroid/graphics/SurfaceTexture;", "cameraSurfaceTexture", "<init>", "(ZZZZJILandroid/view/Choreographer;Landroid/graphics/SurfaceTexture;)V", "a", "Z", "()Z", "b", "c", "getChoreographerRequestInProcess", "d", "getPreviewSurfaceSet", "e", "J", "getPreviousRenderedFrameTimeNanos", "()J", "f", "I", "getGlRenderThreadSubscriptions", "()I", "g", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "h", "Landroid/graphics/SurfaceTexture;", "getCameraSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class GlRenderThreadState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isRenderingFrames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isFrameSourceConnected;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean choreographerRequestInProcess;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean previewSurfaceSet;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long previousRenderedFrameTimeNanos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int glRenderThreadSubscriptions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SurfaceTexture cameraSurfaceTexture;

    public final SurfaceTexture getCameraSurfaceTexture() {
        return this.cameraSurfaceTexture;
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final boolean getChoreographerRequestInProcess() {
        return this.choreographerRequestInProcess;
    }

    public final int getGlRenderThreadSubscriptions() {
        return this.glRenderThreadSubscriptions;
    }

    public final boolean getPreviewSurfaceSet() {
        return this.previewSurfaceSet;
    }

    public final long getPreviousRenderedFrameTimeNanos() {
        return this.previousRenderedFrameTimeNanos;
    }

    /* renamed from: isFrameSourceConnected, reason: from getter */
    public final boolean getIsFrameSourceConnected() {
        return this.isFrameSourceConnected;
    }

    /* renamed from: isRenderingFrames, reason: from getter */
    public final boolean getIsRenderingFrames() {
        return this.isRenderingFrames;
    }

    public GlRenderThreadState(boolean z10, boolean z11, boolean z12, boolean z13, long j10, int i10, Choreographer choreographer, SurfaceTexture surfaceTexture) {
        this.isRenderingFrames = z10;
        this.isFrameSourceConnected = z11;
        this.choreographerRequestInProcess = z12;
        this.previewSurfaceSet = z13;
        this.previousRenderedFrameTimeNanos = j10;
        this.glRenderThreadSubscriptions = i10;
        this.choreographer = choreographer;
        this.cameraSurfaceTexture = surfaceTexture;
    }
}
