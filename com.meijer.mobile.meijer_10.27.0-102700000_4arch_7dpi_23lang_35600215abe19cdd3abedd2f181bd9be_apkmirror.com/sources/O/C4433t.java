package O;

import C.C2979w;
import C.d0;
import C.o0;
import Q.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import com.fullstory.FS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import o2.InterfaceC15993a;
import q.InterfaceC16423a;

/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4433t implements S, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final C4439z f22908a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f22909b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f22910c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f22911d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f22912e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f22913f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f22914g;

    /* renamed from: h, reason: collision with root package name */
    final Map<d0, Surface> f22915h;

    /* renamed from: i, reason: collision with root package name */
    private int f22916i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22917j;

    /* renamed from: k, reason: collision with root package name */
    private final List<b> f22918k;

    /* renamed from: O.t$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static InterfaceC16423a<C2979w, S> f22919a = new InterfaceC16423a() { // from class: O.s
            @Override // q.InterfaceC16423a
            public final Object apply(Object obj) {
                return new C4433t((C2979w) obj);
            }
        };

        public static S a(C2979w c2979w) {
            return f22919a.apply(c2979w);
        }
    }

    /* renamed from: O.t$b */
    static abstract class b {
        abstract c.a<Void> a();

        abstract int b();

        abstract int c();

        static C4415a d(int i10, int i11, c.a<Void> aVar) {
            return new C4415a(i10, i11, aVar);
        }

        b() {
        }
    }

    C4433t(C2979w c2979w) {
        this(c2979w, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void f(C4433t c4433t) {
        c4433t.f22917j = true;
        c4433t.q();
    }

    public static /* synthetic */ void m() {
    }

    C4433t(C2979w c2979w, Map<d.e, C> map) throws ExecutionException, InterruptedException {
        this.f22912e = new AtomicBoolean(false);
        this.f22913f = new float[16];
        this.f22914g = new float[16];
        this.f22915h = new LinkedHashMap();
        this.f22916i = 0;
        this.f22917j = false;
        this.f22918k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f22909b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f22911d = handler;
        this.f22910c = H.a.e(handler);
        this.f22908a = new C4439z();
        try {
            v(c2979w, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    public static /* synthetic */ void j(final C4433t c4433t, final d0 d0Var) {
        Surface surfaceG0 = d0Var.g0(c4433t.f22910c, new InterfaceC15993a() { // from class: O.o
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                C4433t.k(this.f22896a, d0Var, (d0.b) obj);
            }
        });
        c4433t.f22908a.j(surfaceG0);
        c4433t.f22915h.put(d0Var, surfaceG0);
    }

    public static /* synthetic */ void o(final C4433t c4433t, final o0 o0Var) throws ExecutionException, InterruptedException {
        c4433t.f22916i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c4433t.f22908a.g());
        surfaceTexture.setDefaultBufferSize(o0Var.o().getWidth(), o0Var.o().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        o0Var.t(c4433t.f22910c, new o0.i() { // from class: O.p
            @Override // C.o0.i
            public final void a(o0.h hVar) {
                C4433t.i(this.f22898a, o0Var, hVar);
            }
        });
        o0Var.s(surface, c4433t.f22910c, new InterfaceC15993a() { // from class: O.q
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                C4433t.e(this.f22900a, o0Var, surfaceTexture, surface, (o0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c4433t, c4433t.f22911d);
    }

    public static /* synthetic */ void p(C4433t c4433t, Runnable runnable, Runnable runnable2) {
        if (c4433t.f22917j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void q() {
        if (this.f22917j && this.f22916i == 0) {
            Iterator<d0> it = this.f22915h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f22918k.iterator();
            while (it2.hasNext()) {
                it2.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f22915h.clear();
            this.f22908a.k();
            this.f22909b.quit();
        }
    }

    private void r(Runnable runnable) {
        s(runnable, new Runnable() { // from class: O.e
            @Override // java.lang.Runnable
            public final void run() {
                C4433t.m();
            }
        });
    }

    private void s(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f22910c.execute(new Runnable() { // from class: O.f
                @Override // java.lang.Runnable
                public final void run() {
                    C4433t.p(this.f22880a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            C.P.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void t(Throwable th2) {
        Iterator<b> it = this.f22918k.iterator();
        while (it.hasNext()) {
            it.next().a().f(th2);
        }
        this.f22918k.clear();
    }

    private void v(final C2979w c2979w, final Map<d.e, C> map) throws ExecutionException, InterruptedException {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: O.d
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return C4433t.l(this.f22877a, c2979w, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    private void w(Triple<Surface, Size, float[]> triple) throws IOException {
        if (this.f22918k.isEmpty()) {
            return;
        }
        if (triple == null) {
            t(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f22918k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapU = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iC != next.c() || bitmapU == null) {
                        iC = next.c();
                        if (bitmapU != null) {
                            FS.bitmap_recycle(bitmapU);
                        }
                        bitmapU = u(triple.e(), triple.f(), iC);
                        iB = -1;
                    }
                    if (iB != next.b()) {
                        byteArrayOutputStream.reset();
                        iB = next.b();
                        bitmapU.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surfaceD = triple.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.o(surfaceD, byteArray);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            t(e10);
        }
    }

    @Override // C.e0
    public void a(final d0 d0Var) {
        if (this.f22912e.get()) {
            d0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: O.j
            @Override // java.lang.Runnable
            public final void run() {
                C4433t.j(this.f22889a, d0Var);
            }
        };
        Objects.requireNonNull(d0Var);
        s(runnable, new RunnableC4425k(d0Var));
    }

    @Override // O.S
    public com.google.common.util.concurrent.q<Void> b(final int i10, final int i11) {
        return I.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: O.g
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C4433t.h(this.f22883a, i10, i11, aVar);
            }
        }));
    }

    @Override // C.e0
    public void c(final o0 o0Var) {
        if (this.f22912e.get()) {
            o0Var.v();
            return;
        }
        Runnable runnable = new Runnable() { // from class: O.l
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                C4433t.o(this.f22892a, o0Var);
            }
        };
        Objects.requireNonNull(o0Var);
        s(runnable, new RunnableC4427m(o0Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f22912e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f22913f);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry<d0, Surface> entry : this.f22915h.entrySet()) {
            Surface value = entry.getValue();
            d0 key = entry.getKey();
            key.U1(this.f22914g, this.f22913f);
            if (key.getFormat() == 34) {
                try {
                    this.f22908a.n(surfaceTexture.getTimestamp(), this.f22914g, value);
                } catch (RuntimeException e10) {
                    C.P.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                o2.i.j(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                o2.i.j(triple == null, "Only one JPEG output is supported.");
                triple = new Triple<>(value, key.getSize(), (float[]) this.f22914g.clone());
            }
        }
        try {
            w(triple);
        } catch (RuntimeException e11) {
            t(e11);
        }
    }

    @Override // O.S
    public void release() {
        if (this.f22912e.getAndSet(true)) {
            return;
        }
        r(new Runnable() { // from class: O.n
            @Override // java.lang.Runnable
            public final void run() {
                C4433t.f(this.f22895a);
            }
        });
    }

    public static /* synthetic */ void e(C4433t c4433t, o0 o0Var, SurfaceTexture surfaceTexture, Surface surface, o0.g gVar) {
        c4433t.getClass();
        o0Var.k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c4433t.f22916i--;
        c4433t.q();
    }

    public static /* synthetic */ void g(C4433t c4433t, C2979w c2979w, Map map, c.a aVar) throws Throwable {
        c4433t.getClass();
        try {
            c4433t.f22908a.h(c2979w, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object h(final C4433t c4433t, int i10, int i11, final c.a aVar) {
        c4433t.getClass();
        final C4415a c4415aD = b.d(i10, i11, aVar);
        c4433t.s(new Runnable() { // from class: O.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f22886a.f22918k.add(c4415aD);
            }
        }, new Runnable() { // from class: O.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void i(C4433t c4433t, o0 o0Var, o0.h hVar) {
        c4433t.getClass();
        d.e eVar = d.e.DEFAULT;
        if (o0Var.n().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        c4433t.f22908a.o(eVar);
    }

    public static /* synthetic */ void k(C4433t c4433t, d0 d0Var, d0.b bVar) {
        c4433t.getClass();
        d0Var.close();
        Surface surfaceRemove = c4433t.f22915h.remove(d0Var);
        if (surfaceRemove != null) {
            c4433t.f22908a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ Object l(final C4433t c4433t, final C2979w c2979w, final Map map, final c.a aVar) {
        c4433t.getClass();
        c4433t.r(new Runnable() { // from class: O.r
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C4433t.g(this.f22904a, c2979w, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private Bitmap u(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        G.m.c(fArr2, i10, 0.5f, 0.5f);
        G.m.d(fArr2, 0.5f);
        return this.f22908a.p(G.p.o(size, i10), fArr2);
    }
}
