package P;

import C.C2979w;
import C.O;
import C.P;
import C.d0;
import C.o0;
import O.C;
import O.RunnableC4425k;
import O.RunnableC4427m;
import O.S;
import Q.d;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function3;
import o2.InterfaceC15993a;

/* loaded from: classes.dex */
public class o implements S, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final c f24446a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f24447b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f24448c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f24449d;

    /* renamed from: e, reason: collision with root package name */
    private int f24450e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24451f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24452g;

    /* renamed from: h, reason: collision with root package name */
    final Map<d0, Surface> f24453h;

    /* renamed from: i, reason: collision with root package name */
    private SurfaceTexture f24454i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f24455j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Function3<C2979w, O, O, S> f24456a = new Function3() { // from class: P.n
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((C2979w) obj, (O) obj2, (O) obj3);
            }
        };

        public static S a(C2979w c2979w, O o10, O o11) {
            return f24456a.invoke(c2979w, o10, o11);
        }
    }

    o(C2979w c2979w, O o10, O o11) {
        this(c2979w, Collections.EMPTY_MAP, o10, o11);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g(o oVar) {
        oVar.f24451f = true;
        oVar.m();
    }

    o(C2979w c2979w, Map<d.e, C> map, O o10, O o11) throws ExecutionException, InterruptedException {
        this.f24450e = 0;
        this.f24451f = false;
        this.f24452g = new AtomicBoolean(false);
        this.f24453h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f24447b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f24449d = handler;
        this.f24448c = H.a.e(handler);
        this.f24446a = new c(o10, o11);
        try {
            p(c2979w, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    public static /* synthetic */ void d(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f24451f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void i(final o oVar, final d0 d0Var) {
        Surface surfaceG0 = d0Var.g0(oVar.f24448c, new InterfaceC15993a() { // from class: P.j
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                o.h(this.f24438a, d0Var, (d0.b) obj);
            }
        });
        oVar.f24446a.j(surfaceG0);
        oVar.f24453h.put(d0Var, surfaceG0);
    }

    public static /* synthetic */ void j(final o oVar, o0 o0Var) throws ExecutionException, InterruptedException {
        oVar.f24450e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f24446a.t(o0Var.r()));
        surfaceTexture.setDefaultBufferSize(o0Var.o().getWidth(), o0Var.o().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        o0Var.s(surface, oVar.f24448c, new InterfaceC15993a() { // from class: P.m
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                o.f(this.f24443a, surfaceTexture, surface, (o0.g) obj);
            }
        });
        if (o0Var.r()) {
            oVar.f24454i = surfaceTexture;
        } else {
            oVar.f24455j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f24449d);
        }
    }

    private void m() {
        if (this.f24451f && this.f24450e == 0) {
            Iterator<d0> it = this.f24453h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f24453h.clear();
            this.f24446a.k();
            this.f24447b.quit();
        }
    }

    private void n(Runnable runnable) {
        o(runnable, new Runnable() { // from class: P.l
            @Override // java.lang.Runnable
            public final void run() {
                o.e();
            }
        });
    }

    private void o(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f24448c.execute(new Runnable() { // from class: P.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.d(this.f24440a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            P.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void p(final C2979w c2979w, final Map<d.e, C> map) throws ExecutionException, InterruptedException {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: P.g
                @Override // androidx.concurrent.futures.c.InterfaceC1088c
                public final Object a(c.a aVar) {
                    return o.l(this.f24429a, c2979w, map, aVar);
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

    @Override // C.e0
    public void a(final d0 d0Var) throws ProcessingException {
        if (this.f24452g.get()) {
            d0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.h
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f24432a, d0Var);
            }
        };
        Objects.requireNonNull(d0Var);
        o(runnable, new RunnableC4425k(d0Var));
    }

    @Override // C.e0
    public void c(final o0 o0Var) throws ProcessingException {
        if (this.f24452g.get()) {
            o0Var.v();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.f
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                o.j(this.f24427a, o0Var);
            }
        };
        Objects.requireNonNull(o0Var);
        o(runnable, new RunnableC4427m(o0Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f24452g.get() || (surfaceTexture2 = this.f24454i) == null || this.f24455j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f24455j.updateTexImage();
        for (Map.Entry<d0, Surface> entry : this.f24453h.entrySet()) {
            Surface value = entry.getValue();
            d0 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f24446a.v(surfaceTexture.getTimestamp(), value, key, this.f24454i, this.f24455j);
                } catch (RuntimeException e10) {
                    P.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // O.S
    public void release() {
        if (this.f24452g.getAndSet(true)) {
            return;
        }
        n(new Runnable() { // from class: P.e
            @Override // java.lang.Runnable
            public final void run() {
                o.g(this.f24426a);
            }
        });
    }

    public static /* synthetic */ void f(o oVar, SurfaceTexture surfaceTexture, Surface surface, o0.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f24450e--;
        oVar.m();
    }

    public static /* synthetic */ void h(o oVar, d0 d0Var, d0.b bVar) {
        oVar.getClass();
        d0Var.close();
        Surface surfaceRemove = oVar.f24453h.remove(d0Var);
        if (surfaceRemove != null) {
            oVar.f24446a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void k(o oVar, C2979w c2979w, Map map, c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f24446a.h(c2979w, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object l(final o oVar, final C2979w c2979w, final Map map, final c.a aVar) {
        oVar.getClass();
        oVar.n(new Runnable() { // from class: P.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.k(this.f24434a, c2979w, map, aVar);
            }
        });
        return "Init GlRenderer";
    }
}
