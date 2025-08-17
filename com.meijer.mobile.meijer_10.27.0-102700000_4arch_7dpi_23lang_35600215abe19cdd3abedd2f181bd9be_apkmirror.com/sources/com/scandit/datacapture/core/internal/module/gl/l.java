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

/* loaded from: classes11.dex */
public final class l extends HandlerThread implements Choreographer.FrameCallback, NeedsRedrawListener {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f124641A = 0;

    /* renamed from: a, reason: collision with root package name */
    public Size2 f124642a;

    /* renamed from: b, reason: collision with root package name */
    public int f124643b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceTexture f124644c;

    /* renamed from: d, reason: collision with root package name */
    public SurfaceTexture f124645d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f124646e;

    /* renamed from: f, reason: collision with root package name */
    public int f124647f;

    /* renamed from: g, reason: collision with root package name */
    public final i f124648g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f124649h;

    /* renamed from: i, reason: collision with root package name */
    public a f124650i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f124651j;

    /* renamed from: k, reason: collision with root package name */
    public Choreographer f124652k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f124653l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f124654m;

    /* renamed from: n, reason: collision with root package name */
    public long f124655n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f124656o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f124657p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f124658q;

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f124659r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f124660s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f124661t;

    /* renamed from: u, reason: collision with root package name */
    public Function0 f124662u;

    /* renamed from: v, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.utils.f f124663v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f124664w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f124665x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f124666y;

    /* renamed from: z, reason: collision with root package name */
    public final n f124667z;

    public static final void a(l lVar, SurfaceTexture surfaceTexture) {
        lVar.f124661t.set(true);
        if (lVar.f124660s.get()) {
            return;
        }
        try {
            surfaceTexture.updateTexImage();
            com.scandit.datacapture.core.internal.module.utils.f fVar = lVar.f124663v;
            long timestamp = surfaceTexture.getTimestamp();
            long jUptimeMillis = SystemClock.uptimeMillis();
            synchronized (fVar) {
                fVar.f125329c.a(timestamp, jUptimeMillis);
                Unit unit = Unit.f142422a;
            }
            fVar.a();
            n nVar = lVar.f124667z;
            NativeCopiedCameraTexture texture = (NativeCopiedCameraTexture) CollectionsKt.N(nVar.f124670b);
            if (texture == null) {
                texture = (NativeCopiedCameraTexture) nVar.f124669a.invoke();
                nVar.f124671c.add(texture);
            }
            surfaceTexture.getTransformMatrix(lVar.f124656o);
            float[] fArr = lVar.f124658q;
            float[] fArr2 = lVar.f124656o;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[4];
            fArr[2] = fArr2[12];
            fArr[3] = fArr2[1];
            fArr[4] = fArr2[5];
            fArr[5] = fArr2[13];
            fArr[6] = fArr2[2];
            fArr[7] = fArr2[6];
            fArr[8] = fArr2[15];
            float f10 = lVar.f124643b;
            lVar.f124659r.setValues(fArr);
            lVar.f124659r.postTranslate(-0.5f, -0.5f);
            lVar.f124659r.postRotate(f10);
            lVar.f124659r.postTranslate(0.5f, 0.5f);
            lVar.f124659r.getValues(fArr);
            float[] fArr3 = lVar.f124656o;
            float[] fArr4 = lVar.f124658q;
            fArr3[0] = fArr4[0];
            fArr3[4] = fArr4[1];
            fArr3[12] = fArr4[2];
            fArr3[1] = fArr4[3];
            fArr3[5] = fArr4[4];
            fArr3[13] = fArr4[5];
            fArr3[2] = fArr4[6];
            fArr3[6] = fArr4[7];
            fArr3[15] = fArr4[8];
            lVar.f124657p.clear();
            for (float f11 : lVar.f124656o) {
                lVar.f124657p.add(Float.valueOf(f11));
            }
            texture.update(lVar.f124642a, lVar.f124647f, lVar.f124657p);
            n nVar2 = lVar.f124667z;
            nVar2.getClass();
            Intrinsics.j(texture, "texture");
            if (!Intrinsics.e(texture, nVar2.f124672d)) {
                NativeCopiedCameraTexture nativeCopiedCameraTexture = nVar2.f124672d;
                nVar2.f124672d = texture;
                if (nativeCopiedCameraTexture != null && !Intrinsics.e(nativeCopiedCameraTexture, nVar2.f124673e) && !Intrinsics.e(nativeCopiedCameraTexture, nVar2.f124672d)) {
                    nVar2.f124670b.add(nativeCopiedCameraTexture);
                }
            }
            lVar.f124661t.set(false);
        } catch (Throwable th2) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th2, SystemClock.elapsedRealtimeNanos(), lVar.a()));
        }
    }

    public l() {
        super("com.scandit.gl-render-thread");
        this.f124642a = new Size2(0.0f, 0.0f);
        this.f124651j = new AtomicBoolean(false);
        this.f124654m = new AtomicBoolean(false);
        this.f124655n = -1L;
        this.f124656o = new float[16];
        this.f124657p = new ArrayList(16);
        this.f124658q = new float[9];
        this.f124659r = new Matrix();
        this.f124660s = new AtomicBoolean(false);
        this.f124661t = new AtomicBoolean(false);
        this.f124663v = new com.scandit.datacapture.core.internal.module.utils.f();
        start();
        this.f124648g = new i(this);
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
        this.f124666y = arrayList;
        this.f124667z = new n();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        a aVar;
        NativeCopiedCameraTexture texture;
        if (this.f124660s.get()) {
            return;
        }
        if (this.f124653l) {
            this.f124654m.set(false);
            if (j10 <= this.f124655n) {
                return;
            } else {
                this.f124655n = j10;
            }
        } else {
            Choreographer choreographer = this.f124652k;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
        }
        EGLSurface eGLSurface = this.f124646e;
        if (eGLSurface != null && (aVar = this.f124650i) != null && this.f124651j.get() && aVar.b(eGLSurface)) {
            SurfaceTexture surfaceTexture = this.f124644c;
            if (surfaceTexture != null && this.f124661t.get()) {
                try {
                    surfaceTexture.updateTexImage();
                    this.f124661t.set(false);
                } catch (Throwable th2) {
                    SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new UpdateTexImageCrashEvent(th2, j10, a()));
                }
            }
            if (this.f124665x || !this.f124664w || (texture = this.f124667z.f124673e) == null) {
                texture = this.f124667z.f124672d;
            }
            if (texture == null) {
                return;
            }
            Function1 function1 = this.f124649h;
            if (function1 != null) {
                function1.invoke(new j(this.f124666y, new NativeTextureBinding(3553, texture.getTextureId()), this.f124642a, this.f124664w));
            }
            n nVar = this.f124667z;
            nVar.getClass();
            Intrinsics.j(texture, "texture");
            if (!Intrinsics.e(texture, nVar.f124673e)) {
                NativeCopiedCameraTexture nativeCopiedCameraTexture = nVar.f124673e;
                nVar.f124673e = texture;
                if (nativeCopiedCameraTexture != null && !Intrinsics.e(nativeCopiedCameraTexture, texture) && !Intrinsics.e(nativeCopiedCameraTexture, nVar.f124672d)) {
                    nVar.f124670b.add(nativeCopiedCameraTexture);
                }
            }
            if (this.f124651j.get()) {
                aVar.c(eGLSurface);
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener
    public final void setNeedsRedrawInMillis(int i10) {
        if (this.f124660s.get()) {
            return;
        }
        if (i10 == 0 && this.f124654m.compareAndSet(false, true)) {
            this.f124648g.sendEmptyMessage(3);
        } else {
            i iVar = this.f124648g;
            iVar.sendMessage(iVar.obtainMessage(4, Long.valueOf(i10)));
        }
    }

    public final void a(final SurfaceTexture surface, final com.scandit.datacapture.core.internal.module.ui.e doOnFrame, final com.scandit.datacapture.core.internal.module.ui.f doOnFrameAvailable, final boolean z10, final com.scandit.datacapture.core.internal.module.ui.g setNeedsRedrawListener) {
        Intrinsics.j(surface, "surface");
        Intrinsics.j(doOnFrame, "doOnFrame");
        Intrinsics.j(doOnFrameAvailable, "doOnFrameAvailable");
        Intrinsics.j(setNeedsRedrawListener, "setNeedsRedrawListener");
        this.f124648g.post(new Runnable() { // from class: au.a
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f59472a, surface, doOnFrame, doOnFrameAvailable, z10, setNeedsRedrawListener);
            }
        });
    }

    public static final void a(l this$0, SurfaceTexture surface, Function1 doOnFrame, Function0 doOnFrameAvailable, boolean z10, Function1 setNeedsRedrawListener) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(surface, "$surface");
        Intrinsics.j(doOnFrame, "$doOnFrame");
        Intrinsics.j(doOnFrameAvailable, "$doOnFrameAvailable");
        Intrinsics.j(setNeedsRedrawListener, "$setNeedsRedrawListener");
        if (this$0.f124660s.get()) {
            return;
        }
        SurfaceTexture surfaceTexture = this$0.f124645d;
        if (surfaceTexture != null) {
            this$0.a(surfaceTexture);
        }
        this$0.f124652k = Choreographer.getInstance();
        a aVar = this$0.f124650i;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this$0.f124650i;
        this$0.f124646e = aVar2 != null ? aVar2.a(surface) : null;
        this$0.f124645d = surface;
        this$0.f124651j.set(true);
        Choreographer choreographer = this$0.f124652k;
        if (choreographer != null) {
            choreographer.postFrameCallback(this$0);
        }
        this$0.f124649h = doOnFrame;
        this$0.f124653l = z10;
        if (z10) {
            setNeedsRedrawListener.invoke(this$0);
        }
        this$0.f124662u = doOnFrameAvailable;
    }

    public final void a(final SurfaceTexture surfaceTexture, final com.scandit.datacapture.core.internal.module.ui.j andThen) {
        Intrinsics.j(andThen, "andThen");
        this.f124648g.post(new Runnable() { // from class: au.b
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f59478a, surfaceTexture, andThen);
            }
        });
    }

    public static final void a(l this$0, SurfaceTexture surfaceTexture, Function0 andThen) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(andThen, "$andThen");
        if (this$0.f124660s.get()) {
            return;
        }
        this$0.a(surfaceTexture);
        a aVar = this$0.f124650i;
        if (aVar != null) {
            aVar.b();
        }
        andThen.invoke();
    }

    public final void a(SurfaceTexture surfaceTexture) {
        if (Intrinsics.e(this.f124645d, surfaceTexture)) {
            Choreographer choreographer = this.f124652k;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
            a aVar = this.f124650i;
            if (aVar != null) {
                aVar.a(this.f124646e);
            }
            this.f124646e = null;
            this.f124645d = null;
            this.f124651j.set(false);
            this.f124649h = null;
            this.f124662u = null;
            this.f124652k = null;
        }
    }

    public final GlRenderThreadState a() {
        return new GlRenderThreadState(this.f124665x, this.f124664w, this.f124654m.get(), this.f124651j.get(), this.f124655n, g.f124630b.getCounter(), this.f124652k, this.f124644c);
    }
}
