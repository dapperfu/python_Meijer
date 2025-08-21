package P;

import C.C3037w;
import C.O;
import C.P;
import C.d0;
import C.o0;
import O.C;
import O.RunnableC4338k;
import O.RunnableC4340m;
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
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public class o implements S, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final c f25144a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f25145b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f25146c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f25147d;

    /* renamed from: e, reason: collision with root package name */
    private int f25148e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25149f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f25150g;

    /* renamed from: h, reason: collision with root package name */
    final Map<d0, Surface> f25151h;

    /* renamed from: i, reason: collision with root package name */
    private SurfaceTexture f25152i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f25153j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Function3<C3037w, O, O, S> f25154a = new Function3() { // from class: P.n
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((C3037w) obj, (O) obj2, (O) obj3);
            }
        };

        public static S a(C3037w c3037w, O o10, O o11) {
            return f25154a.invoke(c3037w, o10, o11);
        }
    }

    o(C3037w c3037w, O o10, O o11) {
        this(c3037w, Collections.EMPTY_MAP, o10, o11);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g(o oVar) {
        oVar.f25149f = true;
        oVar.m();
    }

    o(C3037w c3037w, Map<d.e, C> map, O o10, O o11) throws ExecutionException, InterruptedException {
        this.f25148e = 0;
        this.f25149f = false;
        this.f25150g = new AtomicBoolean(false);
        this.f25151h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f25145b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f25147d = handler;
        this.f25146c = H.a.e(handler);
        this.f25144a = new c(o10, o11);
        try {
            p(c3037w, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    public static /* synthetic */ void d(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f25149f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void i(final o oVar, final d0 d0Var) {
        Surface surfaceG0 = d0Var.g0(oVar.f25146c, new InterfaceC16068a() { // from class: P.j
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                o.h(this.f25136a, d0Var, (d0.b) obj);
            }
        });
        oVar.f25144a.j(surfaceG0);
        oVar.f25151h.put(d0Var, surfaceG0);
    }

    public static /* synthetic */ void j(final o oVar, o0 o0Var) throws ExecutionException, InterruptedException {
        oVar.f25148e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f25144a.t(o0Var.r()));
        surfaceTexture.setDefaultBufferSize(o0Var.o().getWidth(), o0Var.o().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        o0Var.s(surface, oVar.f25146c, new InterfaceC16068a() { // from class: P.m
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                o.f(this.f25141a, surfaceTexture, surface, (o0.g) obj);
            }
        });
        if (o0Var.r()) {
            oVar.f25152i = surfaceTexture;
        } else {
            oVar.f25153j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f25147d);
        }
    }

    private void m() {
        if (this.f25149f && this.f25148e == 0) {
            Iterator<d0> it = this.f25151h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f25151h.clear();
            this.f25144a.k();
            this.f25145b.quit();
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
            this.f25146c.execute(new Runnable() { // from class: P.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.d(this.f25138a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            P.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void p(final C3037w c3037w, final Map<d.e, C> map) throws ExecutionException, InterruptedException {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: P.g
                @Override // androidx.concurrent.futures.c.InterfaceC1101c
                public final Object a(c.a aVar) {
                    return o.l(this.f25127a, c3037w, map, aVar);
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
        if (this.f25150g.get()) {
            d0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.h
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f25130a, d0Var);
            }
        };
        Objects.requireNonNull(d0Var);
        o(runnable, new RunnableC4338k(d0Var));
    }

    @Override // C.e0
    public void c(final o0 o0Var) throws ProcessingException {
        if (this.f25150g.get()) {
            o0Var.v();
            return;
        }
        Runnable runnable = new Runnable() { // from class: P.f
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, InterruptedException {
                o.j(this.f25125a, o0Var);
            }
        };
        Objects.requireNonNull(o0Var);
        o(runnable, new RunnableC4340m(o0Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f25150g.get() || (surfaceTexture2 = this.f25152i) == null || this.f25153j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f25153j.updateTexImage();
        for (Map.Entry<d0, Surface> entry : this.f25151h.entrySet()) {
            Surface value = entry.getValue();
            d0 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f25144a.v(surfaceTexture.getTimestamp(), value, key, this.f25152i, this.f25153j);
                } catch (RuntimeException e10) {
                    P.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // O.S
    public void release() {
        if (this.f25150g.getAndSet(true)) {
            return;
        }
        n(new Runnable() { // from class: P.e
            @Override // java.lang.Runnable
            public final void run() {
                o.g(this.f25124a);
            }
        });
    }

    public static /* synthetic */ void f(o oVar, SurfaceTexture surfaceTexture, Surface surface, o0.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f25148e--;
        oVar.m();
    }

    public static /* synthetic */ void h(o oVar, d0 d0Var, d0.b bVar) {
        oVar.getClass();
        d0Var.close();
        Surface surfaceRemove = oVar.f25151h.remove(d0Var);
        if (surfaceRemove != null) {
            oVar.f25144a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void k(o oVar, C3037w c3037w, Map map, c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f25144a.h(c3037w, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object l(final o oVar, final C3037w c3037w, final Map map, final c.a aVar) {
        oVar.getClass();
        oVar.n(new Runnable() { // from class: P.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.k(this.f25132a, c3037w, map, aVar);
            }
        });
        return "Init GlRenderer";
    }
}
