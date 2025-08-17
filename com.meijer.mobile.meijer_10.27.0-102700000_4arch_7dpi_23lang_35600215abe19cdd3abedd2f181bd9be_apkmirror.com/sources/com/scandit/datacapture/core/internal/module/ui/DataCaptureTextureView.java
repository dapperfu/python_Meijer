package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES10;
import android.view.MotionEvent;
import android.view.TextureView;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.ui.video.NativePreviewShaderFormat;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class DataCaptureTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f125130a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeVideoPreview f125131b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f125132c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f125133d;

    /* renamed from: e, reason: collision with root package name */
    private final DisposableResource f125134e;

    /* renamed from: f, reason: collision with root package name */
    private Subscription f125135f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f125136g;

    /* renamed from: h, reason: collision with root package name */
    private final p f125137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCaptureTextureView(Context context, DataCaptureView parentView, NativeVideoPreview videoPreview) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(videoPreview, "videoPreview");
        this.f125130a = parentView;
        this.f125131b = videoPreview;
        Lazy lazyB = LazyKt.b(new c(this));
        this.f125132c = lazyB;
        this.f125133d = new AtomicBoolean(false);
        this.f125134e = com.scandit.datacapture.core.internal.module.gl.g.f124630b;
        this.f125136g = new AtomicBoolean(false);
        p pVar = new p(context, ((Number) lazyB.getValue()).floatValue());
        this.f125137h = pVar;
        setSurfaceTextureListener(new i(this));
        parentView._setGestureRecognizer(pVar);
    }

    public static final void b(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f125135f;
        dataCaptureTextureView.f125135f = null;
        if (subscription != null) {
            subscription.use(new k(surfaceTexture, dataCaptureTextureView, subscription));
        }
    }

    public static final void e(DataCaptureTextureView dataCaptureTextureView) {
        if (dataCaptureTextureView.f125135f == null) {
            dataCaptureTextureView.f125135f = dataCaptureTextureView.f125134e.start();
        }
        Subscription subscription = dataCaptureTextureView.f125135f;
        if (subscription != null) {
            subscription.use(new h(dataCaptureTextureView));
        }
    }

    public final void a(FrameSource frameSource) {
        Subscription subscription = this.f125135f;
        if (subscription != null) {
            subscription.use(new b(frameSource));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        p pVar = this.f125137h;
        pVar.getClass();
        Intrinsics.j(event, "event");
        return pVar.f125307b.onTouchEvent(event) || super.onTouchEvent(event);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        if (i10 == 0 && isAvailable()) {
            if (this.f125135f == null) {
                this.f125135f = this.f125134e.start();
            }
            Subscription subscription = this.f125135f;
            if (subscription != null) {
                subscription.use(new h(this));
            }
            this.f125130a.onSurfaceTextureAvailable$scandit_capture_core();
        }
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f125135f;
        if (subscription != null) {
            subscription.use(new d(surfaceTexture));
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f125130a._impl().getVideoGeometry().setViewSize(new Size2(getWidth() / ((Number) this.f125132c.getValue()).floatValue(), getHeight() / ((Number) this.f125132c.getValue()).floatValue()));
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, com.scandit.datacapture.core.internal.module.gl.j jVar) {
        NativePreviewShaderFormat nativePreviewShaderFormat;
        if (dataCaptureTextureView.f125133d.compareAndSet(false, true)) {
            NativeVideoGeometry videoGeometry = dataCaptureTextureView.f125130a._impl().getVideoGeometry();
            videoGeometry.setViewSize(new Size2(dataCaptureTextureView.getWidth() / ((Number) dataCaptureTextureView.f125132c.getValue()).floatValue(), dataCaptureTextureView.getHeight() / ((Number) dataCaptureTextureView.f125132c.getValue()).floatValue()));
            videoGeometry.setFrameSize(jVar.f124635c);
            NativeVideoPreview nativeVideoPreview = dataCaptureTextureView.f125131b;
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.RGBA);
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.OES_EXTERNAL);
            GLES10.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        }
        GLES10.glViewport(0, 0, dataCaptureTextureView.getWidth(), dataCaptureTextureView.getHeight());
        GLES10.glClear(17408);
        if (dataCaptureTextureView.f125136g.get() && jVar.f124636d) {
            ArrayList<NativeTextureBinding> arrayList = new ArrayList<>();
            arrayList.add(jVar.f124634b);
            dataCaptureTextureView.f125131b.setTextureCoordinateTransformation(jVar.f124633a);
            if (jVar.f124634b.getTarget() == 36197) {
                nativePreviewShaderFormat = NativePreviewShaderFormat.OES_EXTERNAL;
            } else {
                nativePreviewShaderFormat = NativePreviewShaderFormat.RGBA;
            }
            dataCaptureTextureView.f125131b.draw(nativePreviewShaderFormat, arrayList, dataCaptureTextureView.f125130a._impl().getVideoGeometry());
        }
        dataCaptureTextureView.f125130a._impl().draw();
    }
}
