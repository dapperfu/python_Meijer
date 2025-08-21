package com.scandit.datacapture.core.internal.module.gl;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Choreographer;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.gl.l;
import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.logger.GlRenderThreadState;
import com.scandit.datacapture.core.logger.SdcLogger;
import com.scandit.datacapture.core.logger.UpdateTexImageCrashEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class l extends HandlerThread implements Choreographer.FrameCallback, NeedsRedrawListener {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f125593A = 0;

    /* renamed from: a, reason: collision with root package name */
    public Size2 f125594a;

    /* renamed from: b, reason: collision with root package name */
    public int f125595b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceTexture f125596c;

    /* renamed from: d, reason: collision with root package name */
    public SurfaceTexture f125597d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f125598e;

    /* renamed from: f, reason: collision with root package name */
    public int f125599f;

    /* renamed from: g, reason: collision with root package name */
    public final i f125600g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f125601h;

    /* renamed from: i, reason: collision with root package name */
    public a f125602i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f125603j;

    /* renamed from: k, reason: collision with root package name */
    public Choreographer f125604k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f125605l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f125606m;

    /* renamed from: n, reason: collision with root package name */
    public long f125607n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f125608o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f125609p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f125610q;

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f125611r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f125612s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f125613t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f125614u;

    /* renamed from: v, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.utils.f f125615v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f125616w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f125617x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f125618y;

    /* renamed from: z, reason: collision with root package name */
    public final n f125619z;

    public static final void a(l lVar, SurfaceTexture surfaceTexture) {
        lVar.f125613t.set(true);
        if (lVar.f125612s.get()) {
            return;
        }
        try {
            surfaceTexture.updateTexImage();
            com.scandit.datacapture.core.internal.module.utils.f fVar = lVar.f125615v;
            long timestamp = surfaceTexture.getTimestamp();
            long jUptimeMillis = SystemClock.uptimeMillis();
            synchronized (fVar) {
                fVar.f126281c.a(timestamp, jUptimeMillis);
                Unit unit = Unit.f143329a;
            }
            fVar.a();
            n nVar = lVar.f125619z;
            NativeCopiedCameraTexture texture = (NativeCopiedCameraTexture) CollectionsKt.N(nVar.f125622b);
            if (texture == null) {
                texture = (NativeCopiedCameraTexture) nVar.f125621a.invoke();
                nVar.f125623c.add(texture);
            }
            surfaceTexture.getTransformMatrix(lVar.f125608o);
            float[] fArr = lVar.f125610q;
            float[] fArr2 = lVar.f125608o;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[4];
            fArr[2] = fArr2[12];
            fArr[3] = fArr2[1];
            fArr[4] = fArr2[5];
            fArr[5] = fArr2[13];
            fArr[6] = fArr2[2];
            fArr[7] = fArr2[6];
            fArr[8] = fArr2[15];
            float f10 = lVar.f125595b;
            lVar.f125611r.setValues(fArr);
            lVar.f125611r.postTranslate(-0.5f, -0.5f);
            lVar.f125611r.postRotate(f10);
            lVar.f125611r.postTranslate(0.5f, 0.5f);
            lVar.f125611r.getValues(fArr);
            float[] fArr3 = lVar.f125608o;
            float[] fArr4 = lVar.f125610q;
            fArr3[0] = fArr4[0];
            fArr3[4] = fArr4[1];
            fArr3[12] = fArr4[2];
            fArr3[1] = fArr4[3];
            fArr3[5] = fArr4[4];
            fArr3[13] = fArr4[5];
            fArr3[2] = fArr4[6];
            fArr3[6] = fArr4[7];
            fArr3[15] = fArr4[8];
            lVar.f125609p.clear();
            for (float f11 : lVar.f125608o) {
                lVar.f125609p.add(Float.valueOf(f11));
            }
            texture.update(lVar.f125594a, lVar.f125599f, lVar.f125609p);
            n nVar2 = lVar.f125619z;
            nVar2.getClass();
            Intrinsics.j(texture, "texture");
            if (!Intrinsics.e(texture, nVar2.f125624d)) {
                NativeCopiedCameraTexture nativeCopiedCameraTexture = nVar2.f125624d;
                nVar2.f125624d = texture;
                if (nativeCopiedCameraTexture != null && !Intrinsics.e(nativeCopiedCameraTexture, nVar2.f125625e) && !Intrinsics.e(nativeCopiedCameraTexture, nVar2.f125624d)) {
                    nVar2.f125622b.add(nativeCopiedCameraTexture);
                }
            }
            lVar.f125613t.set(false);
        } catch (Throwable th2) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th2, SystemClock.elapsedRealtimeNanos(), lVar.a()));
        }
    }

    public l() {
        super("com.scandit.gl-render-thread");
        this.f125594a = new Size2(0.0f, 0.0f);
        this.f125603j = new AtomicBoolean(false);
        this.f125606m = new AtomicBoolean(false);
        this.f125607n = -1L;
        this.f125608o = new float[16];
        this.f125609p = new ArrayList(16);
        this.f125610q = new float[9];
        this.f125611r = new Matrix();
        this.f125612s = new AtomicBoolean(false);
        this.f125613t = new AtomicBoolean(false);
        this.f125615v = new com.scandit.datacapture.core.internal.module.utils.f();
        start();
        this.f125600g = new i(this);
        ArrayList arrayList = new ArrayList(16);
        for (int i10 = 1; i10 < 5; i10++) {
            for (int i11 = 1; i11 < 5; i11++) {
                if (i10 == i11) {
                    arrayList.add(Float.valueOf(1.0f));
                } else {
                    arrayList.add(Float.valueOf(0.0f));
                }
            }
        }
        this.f125618y = arrayList;
        this.f125619z = new n();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        a aVar;
        NativeCopiedCameraTexture texture;
        if (this.f125612s.get()) {
            return;
        }
        if (this.f125605l) {
            this.f125606m.set(false);
            if (j10 <= this.f125607n) {
                return;
            } else {
                this.f125607n = j10;
            }
        } else {
            Choreographer choreographer = this.f125604k;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
        }
        EGLSurface eGLSurface = this.f125598e;
        if (eGLSurface != null && (aVar = this.f125602i) != null && this.f125603j.get() && aVar.b(eGLSurface)) {
            SurfaceTexture surfaceTexture = this.f125596c;
            if (surfaceTexture != null && this.f125613t.get()) {
                try {
                    surfaceTexture.updateTexImage();
                    this.f125613t.set(false);
                } catch (Throwable th2) {
                    SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th2, j10, a()));
                }
            }
            if (this.f125617x || !this.f125616w || (texture = this.f125619z.f125625e) == null) {
                texture = this.f125619z.f125624d;
            }
            if (texture == null) {
                return;
            }
            Function1 function1 = this.f125601h;
            if (function1 != null) {
                function1.invoke(new j(this.f125618y, new NativeTextureBinding(3553, texture.getTextureId()), this.f125594a, this.f125616w));
            }
            n nVar = this.f125619z;
            nVar.getClass();
            Intrinsics.j(texture, "texture");
            if (!Intrinsics.e(texture, nVar.f125625e)) {
                NativeCopiedCameraTexture nativeCopiedCameraTexture = nVar.f125625e;
                nVar.f125625e = texture;
                if (nativeCopiedCameraTexture != null && !Intrinsics.e(nativeCopiedCameraTexture, texture) && !Intrinsics.e(nativeCopiedCameraTexture, nVar.f125624d)) {
                    nVar.f125622b.add(nativeCopiedCameraTexture);
                }
            }
            if (this.f125603j.get()) {
                aVar.c(eGLSurface);
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener
    public final void setNeedsRedrawInMillis(int i10) {
        if (this.f125612s.get()) {
            return;
        }
        if (i10 == 0 && this.f125606m.compareAndSet(false, true)) {
            this.f125600g.sendEmptyMessage(3);
        } else {
            i iVar = this.f125600g;
            iVar.sendMessage(iVar.obtainMessage(4, Long.valueOf(i10)));
        }
    }

    public final void a(final SurfaceTexture surface, final com.scandit.datacapture.core.internal.module.ui.e doOnFrame, final com.scandit.datacapture.core.internal.module.ui.f doOnFrameAvailable, final boolean z10, final com.scandit.datacapture.core.internal.module.ui.g setNeedsRedrawListener) {
        Intrinsics.j(surface, "surface");
        Intrinsics.j(doOnFrame, "doOnFrame");
        Intrinsics.j(doOnFrameAvailable, "doOnFrameAvailable");
        Intrinsics.j(setNeedsRedrawListener, "setNeedsRedrawListener");
        this.f125600g.post(new Runnable() { // from class: au.a
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f59672a, surface, doOnFrame, doOnFrameAvailable, z10, setNeedsRedrawListener);
            }
        });
    }

    public static final void a(l this$0, SurfaceTexture surface, Function1 doOnFrame, Function0 doOnFrameAvailable, boolean z10, Function1 setNeedsRedrawListener) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(surface, "$surface");
        Intrinsics.j(doOnFrame, "$doOnFrame");
        Intrinsics.j(doOnFrameAvailable, "$doOnFrameAvailable");
        Intrinsics.j(setNeedsRedrawListener, "$setNeedsRedrawListener");
        if (this$0.f125612s.get()) {
            return;
        }
        SurfaceTexture surfaceTexture = this$0.f125597d;
        if (surfaceTexture != null) {
            this$0.a(surfaceTexture);
        }
        this$0.f125604k = Choreographer.getInstance();
        a aVar = this$0.f125602i;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this$0.f125602i;
        this$0.f125598e = aVar2 != null ? aVar2.a(surface) : null;
        this$0.f125597d = surface;
        this$0.f125603j.set(true);
        Choreographer choreographer = this$0.f125604k;
        if (choreographer != null) {
            choreographer.postFrameCallback(this$0);
        }
        this$0.f125601h = doOnFrame;
        this$0.f125605l = z10;
        if (z10) {
            setNeedsRedrawListener.invoke(this$0);
        }
        this$0.f125614u = doOnFrameAvailable;
    }

    public final void a(final SurfaceTexture surfaceTexture, final com.scandit.datacapture.core.internal.module.ui.j andThen) {
        Intrinsics.j(andThen, "andThen");
        this.f125600g.post(new Runnable() { // from class: au.b
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f59678a, surfaceTexture, andThen);
            }
        });
    }

    public static final void a(l this$0, SurfaceTexture surfaceTexture, Function0 andThen) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(andThen, "$andThen");
        if (this$0.f125612s.get()) {
            return;
        }
        this$0.a(surfaceTexture);
        a aVar = this$0.f125602i;
        if (aVar != null) {
            aVar.b();
        }
        andThen.invoke();
    }

    public final void a(SurfaceTexture surfaceTexture) {
        if (Intrinsics.e(this.f125597d, surfaceTexture)) {
            Choreographer choreographer = this.f125604k;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
            a aVar = this.f125602i;
            if (aVar != null) {
                aVar.a(this.f125598e);
            }
            this.f125598e = null;
            this.f125597d = null;
            this.f125603j.set(false);
            this.f125601h = null;
            this.f125614u = null;
            this.f125604k = null;
        }
    }

    public final GlRenderThreadState a() {
        return new GlRenderThreadState(this.f125617x, this.f125616w, this.f125606m.get(), this.f125603j.get(), this.f125607n, g.f125582b.getCounter(), this.f125604k, this.f125596c);
    }
}
