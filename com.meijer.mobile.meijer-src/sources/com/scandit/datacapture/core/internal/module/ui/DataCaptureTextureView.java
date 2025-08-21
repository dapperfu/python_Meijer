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

/* loaded from: classes12.dex */
public final class DataCaptureTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f126082a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeVideoPreview f126083b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f126084c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f126085d;

    /* renamed from: e, reason: collision with root package name */
    private final DisposableResource f126086e;

    /* renamed from: f, reason: collision with root package name */
    private Subscription f126087f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f126088g;

    /* renamed from: h, reason: collision with root package name */
    private final p f126089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCaptureTextureView(Context context, DataCaptureView parentView, NativeVideoPreview videoPreview) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(videoPreview, "videoPreview");
        this.f126082a = parentView;
        this.f126083b = videoPreview;
        Lazy lazyB = LazyKt.b(new c(this));
        this.f126084c = lazyB;
        this.f126085d = new AtomicBoolean(false);
        this.f126086e = com.scandit.datacapture.core.internal.module.gl.g.f125582b;
        this.f126088g = new AtomicBoolean(false);
        p pVar = new p(context, ((Number) lazyB.getValue()).floatValue());
        this.f126089h = pVar;
        setSurfaceTextureListener(new i(this));
        parentView._setGestureRecognizer(pVar);
    }

    public static final void b(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f126087f;
        dataCaptureTextureView.f126087f = null;
        if (subscription != null) {
            subscription.use(new k(surfaceTexture, dataCaptureTextureView, subscription));
        }
    }

    public static final void e(DataCaptureTextureView dataCaptureTextureView) {
        if (dataCaptureTextureView.f126087f == null) {
            dataCaptureTextureView.f126087f = dataCaptureTextureView.f126086e.start();
        }
        Subscription subscription = dataCaptureTextureView.f126087f;
        if (subscription != null) {
            subscription.use(new h(dataCaptureTextureView));
        }
    }

    public final void a(FrameSource frameSource) {
        Subscription subscription = this.f126087f;
        if (subscription != null) {
            subscription.use(new b(frameSource));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.j(event, "event");
        p pVar = this.f126089h;
        pVar.getClass();
        Intrinsics.j(event, "event");
        return pVar.f126259b.onTouchEvent(event) || super.onTouchEvent(event);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        if (i10 == 0 && isAvailable()) {
            if (this.f126087f == null) {
                this.f126087f = this.f126086e.start();
            }
            Subscription subscription = this.f126087f;
            if (subscription != null) {
                subscription.use(new h(this));
            }
            this.f126082a.onSurfaceTextureAvailable$scandit_capture_core();
        }
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f126087f;
        if (subscription != null) {
            subscription.use(new d(surfaceTexture));
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f126082a._impl().getVideoGeometry().setViewSize(new Size2(getWidth() / ((Number) this.f126084c.getValue()).floatValue(), getHeight() / ((Number) this.f126084c.getValue()).floatValue()));
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, com.scandit.datacapture.core.internal.module.gl.j jVar) {
        NativePreviewShaderFormat nativePreviewShaderFormat;
        if (dataCaptureTextureView.f126085d.compareAndSet(false, true)) {
            NativeVideoGeometry videoGeometry = dataCaptureTextureView.f126082a._impl().getVideoGeometry();
            videoGeometry.setViewSize(new Size2(dataCaptureTextureView.getWidth() / ((Number) dataCaptureTextureView.f126084c.getValue()).floatValue(), dataCaptureTextureView.getHeight() / ((Number) dataCaptureTextureView.f126084c.getValue()).floatValue()));
            videoGeometry.setFrameSize(jVar.f125587c);
            NativeVideoPreview nativeVideoPreview = dataCaptureTextureView.f126083b;
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.RGBA);
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.OES_EXTERNAL);
            GLES10.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        }
        GLES10.glViewport(0, 0, dataCaptureTextureView.getWidth(), dataCaptureTextureView.getHeight());
        GLES10.glClear(17408);
        if (dataCaptureTextureView.f126088g.get() && jVar.f125588d) {
            ArrayList<NativeTextureBinding> arrayList = new ArrayList<>();
            arrayList.add(jVar.f125586b);
            dataCaptureTextureView.f126083b.setTextureCoordinateTransformation(jVar.f125585a);
            if (jVar.f125586b.getTarget() == 36197) {
                nativePreviewShaderFormat = NativePreviewShaderFormat.OES_EXTERNAL;
            } else {
                nativePreviewShaderFormat = NativePreviewShaderFormat.RGBA;
            }
            dataCaptureTextureView.f126083b.draw(nativePreviewShaderFormat, arrayList, dataCaptureTextureView.f126082a._impl().getVideoGeometry());
        }
        dataCaptureTextureView.f126082a._impl().draw();
    }
}
